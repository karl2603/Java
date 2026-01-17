class Car{
    String name;
    String brand;
    void display(String name){
        System.out.println("Name : "+name);
    }
}
class Petrol extends Car{
    @Override
    void display(String name){
        System.out.println("It is a petrol car");
    }
}

class InheritanceQ2{
    public static void main(String args[]){

    }
}