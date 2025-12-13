public class array3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int target = 6;
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(target - arr[i]);
            mini = Math.min(diff, mini);
        }
        System.out.println(mini);
    }
}