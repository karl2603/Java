import java.util.*;
public class arrayList2 {
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> expenses = new ArrayList<Integer>();
        String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        double total = 0;
        int max = 0;
        for(int i=0;i<7;i++){
            System.out.println("Enter the expense on "+days[i]);
            int expense = Input.nextInt();
            expenses.add(expense);
        }
        for(int i : expenses){
            total = total + i;
            if(i>max){
                max = i;
            }
            if(i>1000){
                expenses.remove(i);
            }
        }
        System.out.println("Expenses = "+expenses);
        System.out.println("Highest Expense = "+max);
        System.out.println("Total Expense = "+total);

    }
}
