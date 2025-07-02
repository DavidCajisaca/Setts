package controller;

import java.util.Set;
import java.util.TreeSet;
import models.Contacto;
import utils.ContactoComparador;
import utils.ContactoComparadorH;
import utils.ContactoComparadorN;

public class ContactoController {
public ContactoController() {
    runtreeContacto();
    runtreeContactonumeros();
    runtreeContactoHash();
}
private void runtreeContactoHash() {
    System.out.println("Agenda ordenada por Hash ");
 Set<Contacto> contactos = new TreeSet<>(new ContactoComparadorH());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
         contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
         contactos.add(new Contacto("Pedro", "Gonzales", "222222222"));
        contactos.add(new Contacto("Pablo", "Lopez", "222222222"));
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
}
private void runtreeContactonumeros() {
    System.out.println("Agenda ordenada por telefono ");
 Set<Contacto> contactos = new TreeSet<>(new ContactoComparadorN());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
         contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
         contactos.add(new Contacto("Pedro", "Gonzales", "222222222"));
        contactos.add(new Contacto("Pablo", "Lopez", "222222222"));
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
}
public void runtreeContacto(){
    System.out.println("Agenda ordenada por apellido, nombre ");
 Set<Contacto> contactos = new TreeSet<>(new ContactoComparador());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
         contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
         contactos.add(new Contacto("Pedro", "Gonzales", "222222222"));
        contactos.add(new Contacto("Pablo", "Lopez", "222222222"));
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }

}
}


