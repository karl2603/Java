import java.util.Scanner;

class InvalidPassword extends Exception {
    InvalidPassword(String Error) {
        super(Error);
    }
}

class Login {
    void login(String username, String password) {
        try {
            if (username.length() >= 0 || password.length() > 6) 
            {
                System.out.println("User logged in successfully");
            } 
            if(username.length() <= 0 )
            {
                System.out.println("Username must not be empty");
            }
            if(password.length() < 6)
            {
                throw new InvalidPassword("Password must be at least 6 characters");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class ErrorHandlingCT4 {

    public static void main(String[] args) {
        Login SRM = new Login();
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = Input.next();
        System.out.println("Enter Password");
        String password = Input.next();
        SRM.login(username, password);
    }
}