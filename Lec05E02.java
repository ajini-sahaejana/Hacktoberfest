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
public class Lec05E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("right", 8.0, 12.0);
        Triangle t3 = new Triangle(4.0);
        
        t1.setStyle("normal");
        
        System.out.println("Infromation of t1: " + t1.toString() );
        System.out.println("Area of t1: " + t1.getArea() );
        System.out.println("Style of the Triangle: " + t1.getStyle());
        
        System.out.println("Infromation of t2: " + t2.toString() );
        System.out.println("Area of t2: " + t2.getArea() );
        
        System.out.println("Infromation of t3: " + t3.toString() );
        System.out.println("Area of t3: " + t3.getArea() );
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(8.0, 12.0);
        
        System.out.println("Information of r1: " + r1.toString() );
        System.out.println("Area of r1: " + r1.getArea() );
        
        System.out.println("Information of r2: " + r2.toString() );
        System.out.println("Area of r2: " + r2.getArea() );
    }
    
}
