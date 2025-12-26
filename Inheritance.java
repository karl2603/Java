class Father {
    String Car = "Verna";
}
class Son extends Father{
    String Bike = "Yezdi";
}


class Inheritance{
    public static void main(String args[]){
Father obj1 = new Father();
Son obj2 = new Son();
System.out.println("Father Vehicle : "+obj1.Car);
System.out.println("Son Vehicle : "+obj2.Car+", "+obj2.Bike);
    }
}