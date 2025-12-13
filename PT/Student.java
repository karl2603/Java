abstract class empl {

    int salary;

    empl(int s) {
        salary = s;
    }

    abstract void salary();
}

class pemp extends empl {

    pemp(int s) {
        super(s);
    }

    int bonus = (salary * 20) / 100;
    int newsal = salary + bonus;

    void salary() {
        System.out.println("Permanent employee salary is " + newsal);
    }
}

class cemp extends empl {

    cemp(int s) {
        super(s);
    }

    int bonus = (salary * 10) / 100;
    int newsal = salary + bonus;

    void salary() {
        System.out.println("Contract employee salary is " + newsal);
    }
}

public class Student {

    public static void main(String[] args) {
    
        cemp c = new cemp(500);
        c.salary();

        pemp p = new pemp(500);
        p.salary();
    }
}
