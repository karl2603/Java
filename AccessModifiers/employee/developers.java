package AccessModifiers.employee;

class Lawyer {
    private String lawyer = "Saul Goodman";

    void displayLawyer() {
        System.out.println("Private : " + lawyer);
    }
}

public class developers {
    public static void main(String[] args) {
        Lawyer Jimmy = new Lawyer();
        Jimmy.displayLawyer();
    }
}
