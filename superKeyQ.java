class UniversityMember{
    String name;
    int id;
    void displayMember(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("Name : "+this.name);
        System.out.println("Id : "+this.id);
    }
}

class Student extends UniversityMember{
    String dept;
    double cgpa;
    void displayStudent(String name, int id, String dept, double cgpa){
        System.out.println("--Student Details--");
        super.displayMember(name, id);
        this.dept = dept;
        this.cgpa = cgpa;
        System.out.println("Department : "+this.dept);
        System.out.println("Cgpa : "+this.cgpa);
    }
}

class Professor extends UniversityMember{
    String course;
    int salary;
    void displayProfessor(String name, int id, String course, int salary){
        System.out.println("--Faculty Details--");
        super.displayMember(name, id);
        this.course = course;
        this.salary = salary;
        System.out.println("Course : "+this.course);
        System.out.println("Salary : "+this.salary);
    }
}
class superKeyQ{
    public static void main(String args[]){
        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();
        Professor prof1 = new Professor();
        stud1.displayStudent("Karl", 29, "Computer Science", 8.97);
        stud2.displayStudent("Vignesh", 27,"Computer Science",7.8);
        stud3.displayStudent("Allwin", 12, "Electronics and Communication Engineering", 7.5);
        prof1.displayProfessor("Hasini", 20, "Law", 89000);
    }
}