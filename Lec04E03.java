/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec04e03;

/**
 *
 * @author Ajini Sahejana
 */
public class Lec04E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator c1 = new Calculator();
        System.out.println("Total: " + c1.add(1, 2, 3));
        System.out.println("Total: " + c1.add(1, 2));
        System.out.println("Total: " + c1.add(1, 2.0));
        System.out.println("Total: " + c1.add(1.0, 3.0));
    }
}
