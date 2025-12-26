class Person {
    Person(String name, int age, long phoneNo) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " + phoneNo);
    }
}

class Employee extends Person {
    Employee(String name, int age, long phoneNo, int id, int salary) {
        super(name, age, phoneNo);
        System.out.println("Employee Id : " + id);
        System.out.println("Salary : " + salary);
    }
}

public class superKey {
    public static void main(String args[]){
        Employee obj1 = new Employee("Karl",19,7550196803L,29,55000);
    }

}
