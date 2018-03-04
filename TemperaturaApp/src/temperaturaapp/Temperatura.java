/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturaapp;

/**
 *
 * @author José Manuel
 */
public class Temperatura {

	//prueba
  
    //Valor de temperatura
    private double temperatura;
    //Fecha de la medicion
    private String fechaMedicion;
    
    public Temperatura(double temperatura, String fechaMedicion) {
        this.temperatura = temperatura;
        this.fechaMedicion = fechaMedicion;
    }
    
    public double getTemperatura() {
        return this.temperatura;
    }
    
    public void setTemperatura(double temperatura) {
         this.temperatura = temperatura;
    }
    
    public String getFechaTemperatura() {
        return this.fechaMedicion;
    }
    
    public void setFechaTemperatura(String fechaMedicion) {
         this.fechaMedicion = fechaMedicion;
    }
    
}
