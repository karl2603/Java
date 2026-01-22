package Writer.FileReader;
import java.io.FileReader;

public class fileReader {
    public static void main(String args[]){
        try{
        FileReader fr = new FileReader("FileReader.txt");
        int c = fr.read();
        while(c != -1){
        System.out.print((char)c);
        c = fr.read();
        }
    }
        catch(Exception e){
            System.out.println("Error using File Reader");
        }
    }
}
