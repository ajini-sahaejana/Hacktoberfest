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
public class Politician implements Speaker, Bounceable{
    
    @Override
    public void speak(){
        System.out.println("Talk Politics");
    }
    
    @Override
    public void bounce(){
        System.out.println("Change Parties");
    }
    
}
