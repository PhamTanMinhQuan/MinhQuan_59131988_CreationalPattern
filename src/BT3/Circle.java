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
public class Circle extends Shape{
    private static Shape circle;
    protected Circle(String brush, String frame, String paper){
       super(brush, paper, frame); 
    }
    public static Shape createCircle(){
        if(circle == null){
            circle = new Circle("Brush-c", "Paper-c", "Frame-c");
        }
        return circle;
    }
    @Override
    public String draw(){
        return "Draw circle: " + getBrush()+ " " 
                               + getPaper()+ " " 
                               + getFrame();
    }
}
   
