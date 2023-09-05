import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class edit extends complete {

    public static void ask(){
        System.out.println("Select what operation you want to do: ");
        System.out.println("1. Edit a record");
        System.out.println("2. Delete a record.");
        System.out.println("3. Exit!");
        System.out.print("Enter your choice: ");
        int x=sc.nextInt();
        switch(x){
            case 1:
            choice1();
            break;
            case 2:
            choice2();
            break;
            case 3:
            break;
        }
    }
    
    public static void choice1(){
        System.out.print("Enter the roll number to edit: ");
        int edit=sc.nextInt();
        sc.nextLine();

        File inputFile=new File("Student.txt");
        File tempFile=new File("temp.txt");

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                 BufferedWriter writer=new BufferedWriter(new FileWriter(tempFile))){
                    
                   String line;
                   while((line=reader.readLine())!=null){
                    if (!line.trim().isEmpty()){
                    String[] parts=line.split("\t");
                    int rollNumber=Integer.parseInt(parts[0]);

                    if(rollNumber==edit){
                        System.out.print("Enter new name: ");
                        String newName=sc.nextLine();
                        System.out.print("Enter new phone number: ");
                        String newPhoneNumber = sc.nextLine();
                        System.out.print("Enter new grade: ");
                        String newGrade = sc.nextLine();

                        line = edit + "\t" + newName + "\t" + newPhoneNumber + "\t" + newGrade;
                    System.out.println("Student details updated successfully.");
                    }

                    writer.write(line);
                    writer.newLine();

                   } 
                }

             } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
             
            if (inputFile.delete()) {
                if (!tempFile.renameTo(inputFile)) {
                    System.out.println("Error renaming the temporary file.");
                }
            } else {
                System.out.println("Error deleting the original file.");
            }
              
            
           
        
        }

   
    public static void choice2(){
        System.out.print("Enter the roll number to delete the complete entry: ");
        int delete=sc.nextInt();
        sc.nextLine();
        System.out.print("Are you sure you want to delete the record of "+ delete + " roll number: ");
        String confirmation=sc.nextLine();
        
        if(confirmation.equals("y")){

        try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"));
             BufferedWriter writer=new BufferedWriter(new FileWriter("temp.txt"));) {

             String line;
             while((line=reader.readLine())!=null){
                if (!line.trim().isEmpty()){
                String[] parts=line.split("\t");
                int rollNumber=Integer.parseInt(parts[0]);

                if(rollNumber!=delete){
                writer.write(line);
                writer.newLine();

                }
                else{
                    System.out.println("Student with roll number " + delete + " deleted.");
                }
             }

             } 
            }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        File inputFile = new File("Student.txt");
        File tempFile = new File("temp.txt");

        if (inputFile.delete()) {
            if (!tempFile.renameTo(inputFile)) {
                System.out.println("Error renaming the temporary file.");
            }
        } else {
            System.out.println("Error deleting the original file.");
        }
    
        

            
        }
        else{
            System.out.println("Cancelling your request....");
        }
    

    
    }
    public static void main(String args[]){
        ask();
    }
}
 


