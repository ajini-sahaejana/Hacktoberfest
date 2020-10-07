/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec05e02;

/**
 *
 * @author Ajini Sahejana
 */
public class Rectangle extends Shape{
    
    public Rectangle(){
        super();
    }
    
    public Rectangle(double w, double h){
        super(w,h);
    }
    
    public double getArea(){
        return width * getHeight();
    }
}
