interface Payment {
    void displayPaymentInfo(double amount);

    default void displayUser() {
        System.out.println("Hi User");
    }
}

class UPI implements Payment {
    @Override
    public void displayPaymentInfo(double amount) {
        System.out.println("Paid Rs" + amount + " by UPI");
    }
}

class Cash implements Payment {
    public void displayPaymentInfo(double amount) {
        System.out.println("Paid Rs" + amount + " by Cash");
    }
}

public class Interface {
    public static void main(String args[]) {
        UPI gpay = new UPI();
        gpay.displayUser();
        gpay.displayPaymentInfo(540);
        Cash Kaasu = new Cash();
        Kaasu.displayPaymentInfo(120);
    }
}
