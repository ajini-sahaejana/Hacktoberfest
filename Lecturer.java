/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec06e01;

/**
 *
 * @author Ajini Sahejana
 */
public class Lecturer implements Speaker{

    @Override
    public void speak() {
        System.out.println("Talks about Object Oriented Programming and Design");
    }
    
}
