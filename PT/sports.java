interface player{
    void play();
}
abstract class sportsPerson{
    String name;
}
class cricketer extends sportsPerson implements player{
    public void play(){
        System.out.println("Cricketer is playing");
    }
}
class footballer extends sportsPerson implements player{
    public void play(){
        System.out.println("Footballer is playing");
    }
}
public class sports{
public static void main(String args[]){
    cricketer c = new cricketer();
    footballer f =new footballer();
    c.play();
    f.play();
}
}