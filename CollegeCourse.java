class Person {
    private String name;
    protected int id;
    final static String CollegeName = "SRM Ramapuram";

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Personal Information");
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("College : " + CollegeName);
    }
}

class Student extends Person {
    String dept;
    String course;

    Student(String name, int id, String dept, String course) {
        super(name, id);
        this.dept = dept;
        this.course = course;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department : " + dept);
        System.out.println("Course : " + course);
    }
}

class Professor extends Person {
    String subject;
    int salary;
    Professor(String name, int id, String subject, int salary){
        super(name, id);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Subject : "+subject);
        System.out.println("Salary : "+salary);
    }

    void IncreasePay(int amount){
        salary += amount;
    }
}

public class CollegeCourse {
public static void main(String args[]){
    Student Karl = new Student("Karl", 29, "CSE", "FullStack Development");
    Student Rupa = new Student("Rupa", 36, "CSE", "App Development");
    Student Vilas =  new Student("Vilas", 03, "CSE", "Designing");
    Professor Anitha = new Professor("Anitha", 19, "Machine Learning", 210000);
    Karl.displayInfo();
    Anitha.IncreasePay(25000);
    Anitha.displayInfo();
}
}
