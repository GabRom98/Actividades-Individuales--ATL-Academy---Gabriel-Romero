package Clase_6;

import java.util.Scanner;

public class Promedio {
    static public void main(String[] args){
        double num1 = numeroIngresado();
        double num2 = numeroIngresado();
        double num3 = numeroIngresado();
        double promedio = calculadorPromedio(num1,num2,num3);
        System.out.println("El promedio obtenido es de " + promedio );
    }

    static public double calculadorPromedio(double num1, double num2, double num3){
        System.out.println("Su promedio es");
        return (num1+num2+num3)/3;
    }

    static public double numeroIngresado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingrese un numero");
        int num = scanner.nextInt();
        return num;
    }
}
