package com.selena;

public class Gato {
    private String nombre;
    private String especie;
    private int edad;

    //2.Metodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void maullar(){
        System.out.println("Maullar");
    }
    public String getNombre() {
        return this.nombre;

    }
    public void comer(String alimento ){
        System.out.println(this.nombre + "alimento" + alimento);
    }
}
