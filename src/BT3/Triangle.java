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
public class Triangle extends Shape{
    private static Shape triangle;
    protected Triangle(String brush, String frame, String paper){
        super(brush, paper, frame);
    }
    public static Shape createTriangle(){
        if(triangle == null){
            triangle = new Triangle("Brush-t", "Paper-t", "Frame-t");
        }
        return triangle;
    }
    @Override
    public String draw(){
        return "Draw triangle: " + getBrush()+ " " 
                                 + getPaper()+ " " 
                                 + getFrame();
    }
}
