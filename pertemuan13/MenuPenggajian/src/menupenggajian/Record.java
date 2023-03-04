/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menupenggajian;

/**
 *
 * @author SH
 */
public class Record {
    // instance variables
    private String name, position;
    private int idNumber;
    private double gapok, tunjangan, totalGaji;
    
    // Default Constructor
    public Record(){}
    
    //Parameterized Contructor
    public Record(String name, int idNumber, String position) {
        // this keyword refers to current instance itself
        this.name = name;
        this.idNumber = idNumber;
        this.position = position;
    }
    
    // Getting the value of idNumber
    // @return the value of idNumber
    public int getIdNumber() { return idNumber; }
    
    // Setting the value of idNumber
    // @param idNumber new value of idNumber
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    
    // Getting the value of name
    // @return the value of name
    public String getName() { return name; }
    
    // Setting the value of name
    // @param name new value of name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getting the value of Jabatan
    // @return the value of Jabatan
    public String getJabatan() { return position;} 
    
    // Setting the value of Jabatan
    // @param name new value of Jabatan
    public void setJabatan(String position) {
        this.position = position;
    }
    
    // toString() Method
    // @return
    @Override public String toString() {
        if (position.equalsIgnoreCase("Direktur")){
            gapok = 5000000.0;
            tunjangan = 2000000.0;
        } else if (position.equalsIgnoreCase("Kabag")) {
            gapok = 3000000.0;
            tunjangan = 1000000.0;
        } else if(position.equalsIgnoreCase("Karyawan")) {
            gapok = 1500000.0;
            tunjangan = 0.0;
        }
        
        totalGaji = gapok + tunjangan;
        
        // Returning the record
        return "Records{"+"idNumber="+idNumber+", name="+name+", Position="+position+", GajiPokok="+gapok+", Tunjangan="+tunjangan+", TotalGaji="+totalGaji+ "}";
    }
}
