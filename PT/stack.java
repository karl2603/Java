import java.util.Stack;

public class stack {

    public static void sort(Stack<Integer> s) {
        Stack<Integer> t = new Stack<>();

        while (!s.isEmpty()) {
            int x = s.pop();

            while (!t.isEmpty() && t.peek() > x) {
                s.push(t.pop());
            }

            t.push(x);
        }

        while (!t.isEmpty()) {
            s.push(t.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(17);
        s.push(12);
        s.push(21);
        s.push(15);

        System.out.println("before sorting " + s);
        sort(s);
        System.out.println("after sorting " + s);
    }
}