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
public class Ball implements Bounceable{  //can make abstract if not implementing all the methods from interfaces

    @Override
    public void bounce(){
        System.out.println("Ball is bouncing fast!");
    }
    
}
