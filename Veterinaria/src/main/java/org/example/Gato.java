package org.example;

public class Gato {
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void comer(String comida){
        System.out.println("Comiendo comida: "+comida);
    }

    public void maullar(){
        System.out.println("Maullando");
    }

    public String getNombre() {
        return this.nombre;
    }
}
