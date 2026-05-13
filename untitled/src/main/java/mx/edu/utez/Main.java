package mx.edu.utez;

import Soto.Andres.Dueño;
import Soto.Andres.Gato;

//En teoria es la ejecuta las funciones del programa
public class Main {
    public static void main(String[] args) {

        Dueño dueño1 = new Dueño();

        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        Gato gato3 = new Gato();


        gato1.setNombre("Sisifus");
        gato2.setNombre("Apio");
        gato3.setNombre("Emchiladas");

        dueño1.mascotas = new Gato[] {gato1,gato2,gato3};

        dueño1.alimentarMascotas();


    }
}