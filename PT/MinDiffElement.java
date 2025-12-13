public class MinDiffElement {

    public static int findClosest(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        if (low == 0) return arr[0];

        if (low == arr.length) return arr[arr.length - 1];

        if (Math.abs(arr[low] - target) < Math.abs(arr[high] - target)) {
            return arr[low];
        } else {
            return arr[high];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 10, 20, 30};
        int target = 8;

        System.out.println("Closest element: " + findClosest(arr, target));
    }
}