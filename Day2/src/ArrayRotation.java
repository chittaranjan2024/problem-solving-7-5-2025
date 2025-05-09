import java.util.Arrays;

public class ArrayRotation {

	public static void reverse(int arr[],int start,int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	
	public static void leftRotate(int arr[],int d)
	{
		int n=arr.length;
		d=d%n;//handle cases where d>n
		
		reverse(arr, 0, d-1);//reverse the first part
		reverse(arr, d, n-1);//reverse the second part
		reverse(arr, 0, n-1);//reverse entire array
		
	}
	
	
	public static void rightRotate(int arr[],int d)
	{
		int n=arr.length;
		d=d%n;//handle cases where d>n
		
		reverse(arr, 0, n-1);//reverse entire array
		reverse(arr, 0, d-1);//reverse the first d elements
		reverse(arr, d, n-1);//reverse the remaining elements
		
	}
	
	public static void main(String[] args) {
		int []originalArray= {10,20,30,40,50,60};
		int array1[]=Arrays.copyOf(originalArray, originalArray.length);
		int array2[]=Arrays.copyOf(originalArray, originalArray.length);
		
		int rotateBy=2;
		
		System.out.println(Arrays.toString(originalArray));
		
		leftRotate(array2, rotateBy);
		System.out.println(Arrays.toString(array2));
		
		rightRotate(array1, rotateBy);
		System.out.println(Arrays.toString(array1));
	}

}
