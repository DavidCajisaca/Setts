package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparadorH implements Comparator<Contacto>{
    @Override
    public int compare(Contacto c1, Contacto c2) {
        //retornar la comparacion de cada hashCode
        int comparacion = Integer.compare(c1.hashCode(), c2.hashCode());
        return comparacion;  
    }

}
