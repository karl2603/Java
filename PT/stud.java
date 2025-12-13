class empl{
    int salary;

    public empl(int salary) {
        this.salary = salary;
    }
    void Salary(){
        System.out.println("salary is "+salary);
    }
}
class pemp extends empl{

    public pemp(int salary) {
        super(salary);
    }
    int bonus1 = (salary*20)/100;
    int sal1=salary+bonus1;

    @Override
    void Salary() {
        System.out.println(sal1);
    }
}
class cemp extends empl{

    public cemp(int salary) {
        super(salary);
    }
    int bonus2 = (salary*10)/100;
    int sal2=salary+bonus2;

    @Override
    void Salary() {
        System.out.println(sal2);
    }
}




public class stud {
    public static void main(String[] args) {
        empl e = new empl(500);
        e.Salary();
        cemp c= new cemp(500);
        c.Salary();
        pemp p= new pemp(500);
        p.Salary();
    }
}