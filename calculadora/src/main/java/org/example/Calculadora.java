package org.example;

public class Calculadora {
//1.Atributos
    //2.metodos
public double sumar(double n1, double n2) {
    double resultado = n1 + n2;
    System.out.println(resultado);
    return resultado;

}
    public double restar(double n1, double n2) {
        double resultado = n1 - n2;
        System.out.println(resultado);
        return resultado;

    }
    public double multiplicar(double n1, double n2) {
        double resultado = n1 * n2;
        System.out.println(resultado);
        return resultado;

    }
    public double dividir(double n1, double n2) {
     if (n2 != 0 ) {
         double resultado = n1 / n2;
         System.out.println(resultado);
         return resultado;
     }else  {
         System.out.println("error , no se puede dividir entre cero");
         return 0;
     }


    }
}
