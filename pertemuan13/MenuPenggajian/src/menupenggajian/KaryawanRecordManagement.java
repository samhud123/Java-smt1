/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menupenggajian;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author SH
 */
public class KaryawanRecordManagement {
    // Creating an empty LinkedList
    LinkedList<Record>list;
    
    // Default Contructer;
    public KaryawanRecordManagement() {
        list = new LinkedList<>();
    }
    
    // Method 1
    // Adding Record
    // @param record
    public void add(Record record) {
        // Checking if a record already exists or not,
        // if not add it to Record list, Otherwise
        // error display message
        if ( !find(record.getIdNumber()) ) {
            list.add(record);
        } else {
            // print statement
            System.out.println("Record already exists in the Record list");
        }
    }
    
    // Method 2
    // Searching Record
    // @param idNimber
    // @return
    public boolean find(int idNumber) {
        // Iterating record list
        // using for eacj loop
        for (Record l : list){
            // checking record by id Number
            if (l.getIdNumber()== idNumber) {
                System.out.println(l);
                return true;
            }
        }
        return false;
    }
    
    // Method 3
    // Delete Record
    // @param recIdNumber
    public void delete(int recIdNumber) {
        Record recordDel = null;
        
        // Iterating record list
        for (Record ll : list) {
            // Finding record to be deleted by id Number
            if ( ll.getIdNumber()==recIdNumber ){
                recordDel = ll;
            }
        }
        
        // If recordDel is null, then show error message,
        // otherwise remove the record from Record list
        if (recordDel == null) {
            // Displaying no record found
            System.out.println("Invalid record id");
        } else {
            list.remove(recordDel);
            
            // Display message fro succesful deletetion of record
            System.out.println("Succesfully removed from the list");
        }
    }
    
    // Method 4
    // Finding Record
    // @param idNumber
    // @return
    public Record findRecord(int idNumber) {
        // Iterate Record list
        // using for each loop
        for ( Record l : list ) {
            // Checking record by id Number
            if ( l.getIdNumber()==idNumber ) {
                return l;
            }
        }
        return null;
    }
    
    // Method 5
    // Update Record
    // @param id
    // @param input
    public void update( int id, Scanner input ){
        String position="";
        if (find(id)) {
            Record rec = findRecord(id);
            
            // Display message only
            System.out.print("What is the new Employee id number ? ");
            int idNumber = input.nextInt();
            
            // Display message only
            System.out.print("What is the new Employee Name ? ");
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
            
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setJabatan(position);
            System.out.println("Record Updated Successfully");
        }else {
            // print statement
            System.out.println("Record Not Found in the Employee list");
        }
    }
    
    // Method 6
    // Display Records
    public void display() {
        // If record list is empty then
        // print the message below
        if (list.isEmpty()) {
            System.out.println("The list no records\n");
        }
        // Iterating Record list
        // using for each loop
        for (Record record : list) {
            // printing the list 
            System.out.println(record.toString());
        }
    }
}
