package Soto.Andres;

public class Dueño {

    private String nombre;
    public Gato[] mascotas;

    public void alimentarMascotas(){
        for (Gato m : mascotas){
            m.comer("salmon");
        }
    }

}
