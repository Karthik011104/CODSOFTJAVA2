import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class complete extends Search {
    public static File details=new File("Student.txt");
    
    public static void show(){
        try{
            File file=new File("Student.txt");
            Scanner fileScanner = new Scanner(file);

            while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            System.out.println(line);
                
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
 public static void main(String args[]){
}    
}
