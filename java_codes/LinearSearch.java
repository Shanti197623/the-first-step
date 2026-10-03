public class LinearSearch {
    // Method to perform linear search
    public static int search(int[] arr, int target) {
        // Loop through the entire array sequentially
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Target found, return its index
            }
        }
        return -1; // Target not found in the array
    }

    public static void main(String[] args) {
        int[] numbers = {10, 45, 23, 89, 7, 12};
        int target = 23;

        int result = search(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}