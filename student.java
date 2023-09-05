import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class student{
    public static String name;
    public static int roll;
    public static int phone;
    public static String grade;
    public static File details=new File("Student.txt");
    public static boolean headerWritten=false;


   

public static void stu(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Name: ");
    name = sc.nextLine();
    System.out.print("Enter Roll No.: ");
    roll = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Phone Number: ");
    phone = sc.nextInt();
    sc.nextLine(); // Consume newline
    System.out.print("Enter Grade: ");
    grade = sc.nextLine();
}



public static void add(){
    stu();
    try  {
        FileWriter myWriter = new FileWriter("Student.txt", true);
        if (details.length() > 0) {
            myWriter.write("\n"); 
        }
        myWriter.write(roll + "\t" + name + "\t" + phone + "\t" + grade);
        myWriter.close();
        System.out.println("Student details added successfully.");
    } catch (IOException e) {
        System.out.println("An error occurred!");
        e.printStackTrace();
    }
}

 public static void main(String args[]){
 }
}