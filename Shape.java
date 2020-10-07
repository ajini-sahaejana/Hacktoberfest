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
public class Shape {
    protected double width;
    private double height;
    
    public Shape(){
        width = 0;
        height = 0;
    }
    
    public Shape(double w, double h){
        this.width = w;
        this.height = h;
    }
    
    public Shape(double x){
        this.width = x;
        this.height = x;
    }
    
    public void setWidth(double w){
        this.width = w;
    }
    
    public void setHeight(double h){
        this.height = h;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
    
    @Override
    public String toString(){
        return "Width: " + this.width + " Height: " + this.height;
    }
}
