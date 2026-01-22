package Writer.FileWriter;
import java.io.FileWriter;

public class fileWriter {
    public static void main(String args[]){
        try{
        FileWriter fw = new FileWriter("FileWriter.txt",true);
        fw.write("My name is Karl");
        fw.close();
        System.out.println("File Write successful");
        }
        catch(Exception e){
            System.out.println("Unable to File Write");
        }
    }    
}
