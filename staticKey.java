public class staticKey {
    static String companyName;
    static int employeeCount = 0;
    String name;
    int employeeId;

    static void displayCompanyInfo() {
        System.out.println("Company Name  : " + companyName);
        System.out.println("Total Number of Employees : " + employeeCount);
    }

    void displayEmployee() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + employeeId);
    }

    staticKey(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        employeeCount = employeeCount + 1;
    }

    public static void main(String args[]) {
        companyName = "Karl & Co";
        staticKey employee1 = new staticKey("Karl", 29);
        staticKey employee2 = new staticKey("Vilas", 03);
        staticKey employee3 = new staticKey("Vignesh", 27);
        staticKey employee4 = new staticKey("Rupa", 36);
        staticKey employee5 = new staticKey("Roshan", 30);
        staticKey employee6 = new staticKey("Allwin", 3);

        displayCompanyInfo();
        employee1.displayEmployee();
        employee2.displayEmployee();
        employee3.displayEmployee();
        employee4.displayEmployee();
        employee5.displayEmployee();
        employee6.displayEmployee();
    }
}
