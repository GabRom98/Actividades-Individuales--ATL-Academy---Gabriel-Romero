package Clase_8;

import java.util.Scanner;

public class areaTriangulo {
    public static void main(String[] args){
        double base = baseUsuario();
        double altura = alturaUsuario();
        calcularAreaTriangulo(base,altura);
    }

    public static double baseUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una base : ");
        double baseIngresado = scanner.nextDouble();

        return baseIngresado;
    }
    public static double alturaUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo: ");
        double alturaIngresado = scanner.nextDouble();
        return alturaIngresado;
    }

    public static void calcularAreaTriangulo(double num, double num2){
        System.out.println(num * num2 / 2);
    }


}
