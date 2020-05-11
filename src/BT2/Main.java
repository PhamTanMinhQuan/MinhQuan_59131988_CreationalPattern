/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author quan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStringBuilder builder = new MyStringBuilder("Minh Quan").addString("16/01/1999")
                .addFloat(1.6f).addbool(true);
        System.out.println(builder.toString());
    }
    
}
