public static void main(String[] args) {
            int[][] arr = {{1, 2, 3}, {4, 5, 6}};
            int target = 5;

            int[] result = search(arr, target);
            System.out.println( result[0] + ", " + result[1]);
        }

        public static int[] search(int[][] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr[i].length; j++) {
                    if (target == arr[i][j]) {
                        return new int[]{i, j};
                    }
                }
            }