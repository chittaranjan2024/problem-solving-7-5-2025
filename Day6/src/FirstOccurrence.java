
public class FirstOccurrence {
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;       // possible answer
                high = mid - 1;     // but look for earlier occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;      // move right
            } else {
                high = mid - 1;     // move left
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int index = firstOccurrence(arr, target);
        if (index != -1)
            System.out.println("First occurrence of " + target + " is at index " + index);
        else
            System.out.println(target + " not found in the array.");
    }
}

