package PT;
abstract class Delivery
{
    double amount;

    Delivery(double amt)
    {
        amount = amt;
    }

    abstract void makePayment();
}

class standardDelivery extends Delivery
{
    standardDelivery(double amt)
    {
        super(amt);
    }

    public void makePayment()
    {
    System.out.println("Standard Delivery = " + amount);
    }
}

class expressDelivery extends Delivery
{
    expressDelivery(double amt)
    {
    super((amt / 10) + amt);
    }

    public void makePayment()
    {
    System.out.println("Express Delivery = " + amount);
    }
}

public class deliveryabstract
{
    public static void main(String args[])
    {
        Delivery d1 = new standardDelivery(500);
        d1.makePayment();
        Delivery d2 = new expressDelivery(200);
        d2.makePayment();
    }
}
