class Car{
    String name;
    String brand;
    void display(){
        System.out.println("Name : "+name);
    }
}
class Petrol extends Car{
    @Override
    void display(){
        System.out.println("Name : "+name);
        System.out.println("It is a petrol car");
    }
}

class Diesel extends Car{
    @Override
    void display(){
        System.out.println("Name : "+name);
        System.out.println("It is a diesel car");
    }
}
class InheritanceQ3{
    public static void main(String args[]){
        Petrol Verna = new Petrol();
        Verna.name = "Verna";
        Verna.display();
        Diesel Harrier = new Diesel();
        Harrier.name = "Harrier";
        Harrier.display();
    }
}