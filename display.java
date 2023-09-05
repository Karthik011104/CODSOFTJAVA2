import java.util.*;

public class display extends edit{
    public static int choice;
    
    public static void base(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Select one of the following options: ");
        System.out.println("1. Add new Student details ");
        System.out.println("2. Edit or delete the current details of a student");
        System.out.println("3. Search a student ");
        System.out.println("4. Display complete list of students");
        System.out.println("5. Exit!");
        System.out.print("\n Enter your choice: ");
        choice=sc.nextInt();

    }
    public static void choice(){
        base();
        switch (choice) {
            case 1:
                add();
                choice();
                break;
            case 2:
                ask();
                 choice();
                break;
            case 3:
                cases();
                choice();
                break;
            case 4:
                show();
                choice();
                break;
            case 5:
                System.out.println("You have chosen to terminate the program!");
                break;
        }

      
    }
    public static void main(String args[]){
    }
        
    }
    

