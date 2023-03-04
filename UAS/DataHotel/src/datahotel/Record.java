/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datahotel;

/**
 *
 * @author SH
 */
public class Record {
    private String name, position;
    private int kodeTransaksi;
    private double gapok, tunjangan, totalGaji;
    
    public int getIdNumber() { return kodeTransaksi; }
    public void setIdNumber(int idNumber) {
        this.kodeTransaksi = idNumber;
    }
}
