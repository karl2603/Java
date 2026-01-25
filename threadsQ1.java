class LoginUser implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name+" started Login");
        try{
            Thread.sleep(1000);
            System.out.println(name+" login successful");
        }
        catch(Exception e){
            System.out.println("ERROR!");
        }
    }
}
public class threadsQ1 {
    public static void main(String args[]){
        LoginUser User = new LoginUser();
        Thread t1 = new Thread(User,"Karl");
        Thread t2 = new Thread(User,"Hasu");
        Thread t3 = new Thread(User,"Vijay");
        t1.start();
        t2.start();
        t3.start();
    }
}
