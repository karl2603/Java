package Writer.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class bufferedWriter {
    public static void main(String args[]){
        try{
        FileWriter fw = new FileWriter("BufferedWriter.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.append("I love Java");
        bw.close();
        System.out.println("Buffered Write created successfully");
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }    
}
