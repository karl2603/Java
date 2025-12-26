class Person{
String name;
int age;
long phoneNo;

void displayInfo(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
    System.out.println("Phone Number : "+phoneNo);
}
}

class Student extends Person{
    String dept = "Computer Science";
    String regNo;   
    void displayStudent(){
        displayInfo();
        System.out.println("Department : "+dept);
        System.out.println("Registration Number : "+regNo);
    }
}

class Grade extends Student{
    void displayGrade(double cgpa, int arrear){
        displayStudent();
        System.out.println("Grade : "+cgpa+" Arrear : "+arrear);
    }
}



class InheritanceQ1{
    public static void main(String args[]){
        Grade Karl = new Grade();
        Karl.name = "Karl";
        Karl.age = 19;
        Karl.phoneNo = 7550196803L;
        Karl.regNo = "RA2311003020029";
        Karl.displayGrade(8.97, 0);
        Grade Vilas = new Grade();
        Vilas.name = "Vilasni";
        Vilas.age = 20;
        Vilas.phoneNo = 7305069326L;
        Vilas.regNo = "RA2311003020003";
        Vilas.displayGrade(8.6,0);
    }
}