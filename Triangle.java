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
public class Triangle extends Shape{
    
    private String style;
    
    public Triangle(){
        super();
        style = null;
    }
    
    public Triangle (String s, double w , double h){
        super(w,h);
        this.style = s;
    }
    
    public Triangle (String s, double x){
        super(x);
        this.style = s;
    }
    
    public Triangle (double x){
        super(x);
        this.style = "isosceles";
    }
    
    /**
     *
     * @return
     */
    public double getArea(){
        return width * getHeight() * 0.5;
    }
    
    public void setStyle(String s){
        this.style = s;
    }

    /**
     * @return the style
     */
    public String getStyle() {
        return style;
    }
    
}
