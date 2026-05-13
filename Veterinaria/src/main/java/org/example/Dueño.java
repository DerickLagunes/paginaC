package org.example;

public class Dueño {

    private String nombre;
    public Gato[] mascotas;

    public void alimentarMascota(){
        for(Gato gato : mascotas) {
            System.out.println("Alimentando a:" + gato.getNombre());
        }
    }

}
