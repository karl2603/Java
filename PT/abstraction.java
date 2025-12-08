package PT;
abstract class payment 
{
    double money;

    payment(double m)
    {
    money = m;
    }

    abstract void makepayment();

    void generate()
    {
    System.out.println("money recieved is " + money);
    }
}

class makePayment extends payment
{
    makePayment(double amt)
    {
    super(amt);
    }

    void makepayment()
    {
    System.out.println("Total Amount " + money);
    }
}

class upiPayment extends payment
{
    upiPayment(double amt)
    {
    super(amt);
    }

    void makepayment()
    {
    System.out.println("Amount paid through UPI" + money);
    }
}

public class abstraction
{
    public static void main(String args[])
    {
        makePayment m1 = new makePayment(500);
        m1.makepayment();

        upiPayment m2 = new upiPayment(500);
        m2.makepayment();
    }
}
