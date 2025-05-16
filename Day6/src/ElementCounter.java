
public class ElementCounter {

    // Binary search to find first occurrence
    public static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;  // keep searching in the left half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Binary search to find last occurrence
    public static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;  // keep searching in the right half
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    // Main method to count occurrences
    public static int countOccurrences(int[] arr, int target) {
        int first = findFirst(arr, target);
        if (first == -1) {
            return 0; // Element not found
        }
        int last = findLast(arr, target);
        return (last - first + 1);
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int count = countOccurrences(sortedArray, target);
        System.out.println("Element " + target + " occurs " + count + " times.");
    }
}

