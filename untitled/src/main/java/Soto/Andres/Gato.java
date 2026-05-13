package Soto.Andres;

public class Gato {

    public String nombre;
    public String especie;
    public int edad;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void comer(String comida){
        System.out.println("El gato " + this.nombre + "esta comiendo " + comida);
    }

    public void maullar(){
        System.out.println(this.nombre + ": Miau");
    }
}
