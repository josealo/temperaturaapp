/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturaapp;

import java.util.ArrayList;

/**
 *
 * @author José Manuel
 */
public class TemperaturaApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        TemperaturaHash tempHash = new TemperaturaHash();
        
        tempHash.addTemperatura(0, "01-01-2016");
        tempHash.addTemperatura(-1, "02-01-2016");
        tempHash.addTemperatura(-5, "03-01-2016");
        //...
        tempHash.addTemperatura(2, "05-01-2016");
        //...
        tempHash.addTemperatura(5, "31-01-2016");
        tempHash.addTemperatura(5, "01-02-2016");
        //...
        tempHash.addTemperatura(25, "26-06-2016");
        //...
        tempHash.addTemperatura(40, "11-08-2016");
        //...
        tempHash.addTemperatura(5, "11-10-2016");
        //...
        
        System.out.println("Max temperatura: " + tempHash.getMaxTemperatura().getTemperatura() + "ºC");
        System.out.println("Min temperatura: " + tempHash.getMinTemperatura().getTemperatura() + "ºC");
        
        System.out.println("\nTemperatura: 5ºC");
        ArrayList al = tempHash.getTemperatura(5);        
        for (int i=0; i<al.size(); i++) {
            System.out.println("Fecha: " + ((Temperatura) al.get(i)).getFechaTemperatura());
        }       
        
    }
    
}
