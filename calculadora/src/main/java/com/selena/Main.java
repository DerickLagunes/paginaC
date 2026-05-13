package com.selena;

public class Main {
    public static void main(String[] args) {
        Dueño dueño1 = new Dueño();

        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        Gato gato3 = new Gato();
        gato1.setNombre("carol");
        gato2.setNombre("avril");
        gato3.setNombre("mer");


        dueño1.mascotas = new Gato[] {gato1,gato2,gato3};
        dueño1.alimentarMascota("croquetas");
    }
}
