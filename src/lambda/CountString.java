/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

/**
 *
 * @author dam
 */
public class CountString implements ICountString {

    @Override
    public String contar(String palabra) {
        
        
     return "Longitud = "+palabra.length();
    }
    
}
