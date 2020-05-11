/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author quan
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape r = sf.createShape(ShapeType.Rectangle);
        Shape c = sf.createShape(ShapeType.Circle);
        Shape t = sf.createShape(ShapeType.Triangle);
        System.out.println(r.draw());
        System.out.println(c.draw());
        System.out.println(t.draw());
    }
    
}
