package org.example;

public class Main {
    public static void main(String[] args) {
        Gato misifus = new Gato();
        Gato pepo = new Gato();
        Gato iguano = new Gato();

        misifus.setNombre("Misifus");
        pepo.setNombre("Pepo");
        iguano.setNombre("Iguano");


        Dueño Kevin = new Dueño();
        Gato[] mascotas = { misifus, pepo, iguano };
        Kevin.mascotas = mascotas;

        Kevin.alimentarMascota();

    }
}