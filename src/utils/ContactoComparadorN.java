package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparadorN implements Comparator<Contacto> {
    @Override
    public int compare(Contacto c1, Contacto c2) {
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

    int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
    if (comparacionNombre != 0) {
        return comparacionNombre;
    }
    // si el nombre es igual compare el telefono descententemente
    return c2.getTelefono().compareToIgnoreCase(c1.getTelefono());
    }

}
