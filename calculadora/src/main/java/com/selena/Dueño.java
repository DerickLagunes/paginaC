package com.selena;

public class Dueño {
    private String nombre;
    //se asumeque que la relacion tiene 1 o mas gatos
    public Gato[] mascotas;
    public void alimentarMascota(String alimento ){
        for( Gato gato : mascotas ){
            gato.comer(alimento);
        }
    }
}
