package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //intanciar un objeto de clase calculadora
        Calculadora calcu = new Calculadora();

        double acumulado = 0.0;

        acumulado += calcu.sumar(10,5);
        acumulado += calcu.restar(500,100);
        acumulado += calcu.multiplicar(3,5);
        acumulado += calcu.dividir(8,0);
        acumulado += calcu.dividir(81,9);
    System.out.println("valor acumulado = " + acumulado);
    }
}