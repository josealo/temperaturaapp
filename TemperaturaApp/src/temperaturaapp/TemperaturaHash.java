/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturaapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author José Manuel
 */
public class TemperaturaHash {
    
    //Hash que contiene cada lista de temperatura unica
    HashMap temperaturaHash;
    
    public TemperaturaHash() {
        temperaturaHash = new HashMap();
    }
    
    //Devuelve la lista de ocurrencias de la temperatura
    public ArrayList getTemperatura(double temperatura) {
        ArrayList v = (ArrayList) temperaturaHash.get(Double.valueOf(temperatura));
        return v;
    }
    
    //Añade una temperatura al HashMap
    public void addTemperatura(double temperatura, String fecha) {
        Double tempDouble = temperatura;
        ArrayList v = (ArrayList) temperaturaHash.get(tempDouble);
        if (v == null) {
            v = new ArrayList();
        } else {
            temperaturaHash.remove(tempDouble);
        }
        
        v.add(new Temperatura(temperatura, fecha));
        temperaturaHash.put(tempDouble, v);
    }
    
    //Ordena las temperaturas en orden ascendente
    private List<Double> sortTemperaturas() {
        List<Double> li = new ArrayList<Double>(temperaturaHash.keySet());
        Collections.sort(li);
        
        return li;
    }
    
    //Devuelve la temperatura maxima registrada
    public Temperatura getMaxTemperatura() {
        List<Double> li = sortTemperaturas();
        Double db = li.get(li.size()-1);
        ArrayList al = (ArrayList) temperaturaHash.get(db);
        return (Temperatura) al.get(0);
    }
    
    //Devuelve la temperatura minima registrada
    public Temperatura getMinTemperatura() {
        List<Double> li = sortTemperaturas();
        Double db = li.get(0);
        ArrayList al = (ArrayList) temperaturaHash.get(db);
        return (Temperatura) al.get(0);
    }
}
