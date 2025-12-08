import java.util.Scanner;

class ArrayQ1 {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        int n = Input.nextInt();
        int[] Marks = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            Marks[i] = Input.nextInt();
        }
       /*  if (n-1 % 2 == 0) {
            System.out.print(Marks[n / 2]+"and"+Marks[]);
        } else if (n-1 % 2 != 0) {
            System.out.print(Marks[n / 2 + 1]);
        } */
    }
}