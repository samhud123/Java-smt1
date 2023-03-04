/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datahotel;

/**
 *
 * @author SH
 */
public class RecordManagement {
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
}
