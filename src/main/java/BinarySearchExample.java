public class BinarySearchExample {
    public static void main(String[] args) {
        int[] sortedArray = {3, 4, 5, 6, 8, 11, 23};
        int target = 30;
        int foundIndex = findElement(sortedArray, target);
        if (foundIndex == -1) {
            System.out.println("Target is not present");
        }
    }

    public static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index " + mid);
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //
// If the loop finishes without finding the target, it's not in the array.
        // We typically return -1 to indicate this.
        return -1;
    }
}
