package org.security.jwt.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.security.jwt.model.User;
import org.security.jwt.repository.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
		
		User user=(User) userRepository.findUserByUserNameOrEmail(usernameOrEmail, usernameOrEmail)
				.orElseThrow(()->new UsernameNotFoundException("User not exist by username or email!! "));
		
		Set<GrantedAuthority> authorities=user.getRoles().stream()
				.map((role)->new SimpleGrantedAuthority(role.getName()))
				.collect(Collectors.toSet());
		
		return new org.springframework.security.core.userdetails.User(usernameOrEmail, user.getPassword(), authorities);
	}
	
	
	
}
