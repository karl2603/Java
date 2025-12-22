class constructor {
    String name;
    int regNo;
    String dept;
    long phn;

    constructor(){
        name = "Unknown";
        regNo = 0;
        dept = "Unknown";
        phn = 0;
    }
    
    constructor(String name, int regNo, String dept, long phn){
        this.name = name;
        this.regNo = regNo;
        this.dept = dept;
        this.phn = phn;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Registration Number : "+regNo);
        System.out.println("Department : "+dept);
        System.out.println("Phone Number : "+phn);
    }


    public static void main(String args[]) {
        constructor stud1 = new constructor();
        constructor stud2 = new constructor("Karl", 29, "CSE", 7550196803L);
        System.out.println("Default Constructor");
        stud1.display();
        System.out.println("--Constructor using this keyword and parameters--");
        stud2.display();
    }
}