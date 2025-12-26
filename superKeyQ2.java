class Payment{
    String name;
    int amount;
    Payment(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    void displayInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Amount : "+this.amount);
    }
}

class UPI extends Payment{
    String UpiId;
    UPI(String name, int amount, String UpiId){
        super(name, amount);
        this.UpiId = UpiId;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("UPI ID : "+UpiId);
    }
}

class Card extends Payment{
    long cardNum;
    Card(String name, int amount, long cardNum){
        super(name, amount);
        this.cardNum = cardNum;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Card Number : "+cardNum);
    }
}
class superKeyQ2{
    public static void main(String args[]){
        UPI gpay = new UPI("Karl", 500 , "75501976803@oksbi");
        Card SBI = new Card("Maiklin", 83000, 7837812792737L );
        gpay.displayInfo();
        SBI.displayInfo();
    }
}