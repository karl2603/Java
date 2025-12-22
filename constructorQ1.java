class constructorQ1 {
    String name;
    long accountNo;
    String type;
    int balance;

    constructorQ1() {
        name = "Unknown";
        accountNo = 99999999;
        type = "Demo";
        balance = 0;
    }

    constructorQ1(String name, long accountNo) {
        this.name = name;
        this.accountNo = accountNo;
        type = "Saving";
        balance = 5500;
    }

    constructorQ1(String name, long accountNo, String type) {
        this.name = name;
        this.accountNo = accountNo;
        this.type = type;
        balance = 1500;
    }

    constructorQ1(String name, long accountNo, String type, int balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.type = type;
        this.balance = balance;
    }

    void display() {
        System.out.println("--Account Details--");
        System.out.println("Name: " + name);
        System.out.println("Account Number : " + accountNo);
        System.out.println("Account Type : " + type);
        System.out.println("Balance : " + balance);
    }

    public static void main(String args[]) {
        constructorQ1 userDefault = new constructorQ1();
        constructorQ1 userP2 = new constructorQ1("Karl", 260306L);
        constructorQ1 userP3 = new constructorQ1("Hasini", 200708L, "Credit");
        constructorQ1 userP4 = new constructorQ1("Vijay", 100575, "Saving", 245000);
        userDefault.display();
        userP2.display();
        userP3.display();
        userP4.display();
    }
}