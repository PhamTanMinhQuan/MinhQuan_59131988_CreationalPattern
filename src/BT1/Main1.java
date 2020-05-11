/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author quan
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HoaDon HD = new HoaDon.Builder().setHeader( new HoaDonHeader("666", "16/01/1999", "Minh Quan"))
        .addDSHD( new CTHD("Laptop", 1, 5000000, 1)).build();
        System.out.println(HD.toString());
    } 
    
}
