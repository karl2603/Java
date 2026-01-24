package Writer.BufferedReader;

import java.io.FileReader;
import java.io.BufferedReader;

public class bufferedReader {
    public static void main(String args[]){
        try{
        FileReader fr = new FileReader("bufferedReader.txt");
        BufferedReader br = new BufferedReader(fr);
        String Line = br.readLine();
        while(Line != null){
            System.out.println(Line);
            Line = br.readLine();
        }
        br.close();
    } 
    catch(Exception e){
System.out.println("Error");
    }
    }
}
