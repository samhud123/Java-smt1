/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menupenggajian;
import java.util.Scanner;
/**
 *
 * @author SH
 */
public class KaryawanRecordLinkedList {
    
    public static void main(String[] args) {
        String position="";
        
        KaryawanRecordManagement hr = new KaryawanRecordManagement();
        
        Record record = new Record();
        
        // Initial Employee record
        // Using mutators to had code the data
        record.setIdNumber(1111);
        record.setName("Samirul");
        record.setJabatan("Direktur");
        
        // Calling add() record method to
        // add static data/(Hard CodedData) to linked List
        hr.add(record);
        
        // Creating Scanner Object to read input
        Scanner input = new Scanner(System.in);
        
        // Creating option integer variable
        int option = 0;
        
        // Do - While Loop
        do {
            menu();
            option = input.nextInt();
            
            // Switch case
            switch (option) {
                case 1:
                    // Display message
                    System.out.print("What is the Employee id Number ? ");
                    int idNumber = input.nextInt();
                    
                    // Display message
                    System.out.print("What is the Employee Name ? ");
                    String name = input.next();
                    
                    System.out.println("+====================+");
                    System.out.println("|      Position      |");
                    System.out.println("|====================|");
                    System.out.println("| 1. Direktur        |");
                    System.out.println("| 2. Kabag           |");
                    System.out.println("| 3. Karyawan        |");
                    System.out.println("+====================+");
                    
                    // Display message
                    System.out.print("What is the Employee position ? (Choose a number) ");
                    int jabatan = input.nextInt();
                    if (jabatan == 1){
                        position = "Direktur";
                    } else if(jabatan == 2){
                        position = "Kabag";
                    } else if(jabatan == 3){
                        position = "Karyawan";
                    } else {
                        System.out.println("Record Not Found!");
                    }
                    
                    // Create record object and pass contructor
                    // parameters
                    record = new Record(name, idNumber, position);
                    // Call add() record
                    hr.add(record);
                    System.out.println(record.toString());
                    
                    // Break statement used to terminate program
                    // from here only once it entered this case
                    break;
                case 2:
                    // Display message
                    System.out.print("What is the Employee id Number ? ");
                    int rld = input.nextInt();
                    
                    // Invoke remove/delete record
                    hr.delete(rld);
                    break;
                case 3:
                    // Display message
                    System.out.print("What is the Employee id Number ? ");
                    int rldNo = input.nextInt();
                    hr.update(rldNo, input);
                    break;
                case 4:
                    // Display message
                    System.out.print("What is the Employee id Number ? ");
                    int bookId = input.nextInt();
                    
                    if (!hr.find(bookId)) {
                        System.out.println("Employee id does not exist\n");
                    }
                    break;
                case 5:
                    hr.display();
                    break;
                case 6:
                    // Display message 
                    System.out.println("\nThank you for using the program. Goodbye!\n");
                    System.exit(0);
                    break;
                default:
                    // print statement
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }  while(option !=9);
    }
    
    // Method 2
    // Menu - Static menu for displaying options
    public static void menu() {
        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Employee");
        System.out.println("2: Delete Employee");
        System.out.println("3: Update Employee");
        System.out.println("4: Search Employee");
        System.out.println("5: Display Employee");
        System.out.println("6: Exit Program");
        System.out.print("Enter your selecion : ");
    }
}
