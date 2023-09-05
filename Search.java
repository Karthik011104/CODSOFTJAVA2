import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search extends student{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cases();
    }

    public static void cases() {
        int choice;
        do {
            System.out.println("\n Select how you want to search:");
            System.out.println("1. By Roll Number");
            System.out.println("2. By Name");
            System.out.println("3. By Grade");
            System.out.println("4. By Phone Number");
            System.out.println("5. Exit");
            System.out.print("\n Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    searchByRoll();
                    break;
                case 2:
                    searchByName();
                    break;
                case 3:
                    searchByGrade();
                    break;
                case 4:
                    searchByPhone();
                    break;
                case 5:
                    System.out.println("Exiting search.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }

    public static void searchByRoll() {
    System.out.print("Enter Roll number: ");
    int searchRoll = sc.nextInt();
    sc.nextLine();

    try {
        File file = new File("Student.txt");
        Scanner fileScanner = new Scanner(file);
        boolean found = false;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split("\t");
            if (parts.length >= 4) {
                int roll = 0;
                try {
                    roll = Integer.parseInt(parts[0]);
                } catch (NumberFormatException e) {
                    // Handle parsing error
                }

                if (roll == searchRoll) {
                    System.out.println("Student found!");
                    System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2] + "\t" + parts[3]);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Student with Roll Number " + searchRoll + " not found.");
        }
        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found.");
    }
}
 
    public static void searchByName(){
System.out.print("Enter the name: ");
    String searchName = sc.next();
    sc.nextLine();

    try {
        File file = new File("Student.txt");
        Scanner fileScanner = new Scanner(file);
        boolean found = false;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split("\t");
            if (parts.length >= 4) {
                String name=parts[1];

                if (name.equalsIgnoreCase(searchName)) {
                    
                    System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2] + "\t" + parts[3]);
                    found = true;
                    
                }
            }
        }
        if (!found) {
            System.out.println("Student with Name " + searchName + " not found.");
        }
        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found.");
    }
}


    public static void searchByGrade(){
        System.out.print("Enter the grade: ");
    String searchGrade= sc.next();
    sc.nextLine();

    try {
        File file = new File("Student.txt");
        Scanner fileScanner = new Scanner(file);
        boolean found = false;
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split("\t");
            if (parts.length >= 4) {
                String grade=parts[3];

                if (grade.equalsIgnoreCase(searchGrade)) {
                    System.out.println("Student found!");
                    System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2] + "\t" + parts[3]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Student with Grade " + searchGrade + " not found.");
        }
        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found.");
    }
}

   
public static void searchByPhone() {
    System.out.print("Enter the phone number: ");
    int searchPhone = sc.nextInt();
    sc.nextLine();

    try {
        File file = new File("Student.txt");
        Scanner fileScanner = new Scanner(file);
        boolean found = false;

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split("\t");

            if (parts.length >= 4) {
                int phone = 0;
                try {
                    phone = Integer.parseInt(parts[2]);
                } catch (NumberFormatException e) {
                    // Handle parsing error
                }

                if (phone == searchPhone) {
                    System.out.println("Student found!");
                    System.out.println(parts[0] + "\t" + parts[1] + "\t" + parts[2] + "\t" + parts[3]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Student with Phone Number " + searchPhone + " not found.");
        }

        fileScanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("File not found.");
    }
}


}
    



    

