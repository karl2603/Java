import java.util.Scanner;

class rockPaperSwitch {
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        String Value = Input.nextLine();
        switch (Value) {
            case "Rock":
                System.out.print("Paper");
                break;
            case "Paper":
                System.out.print("Scissor");
                break;
            case "Scissor":
                System.out.print("Rock");
                break;
            default:
                System.out.print("Invalid Input");
        }
    }
}