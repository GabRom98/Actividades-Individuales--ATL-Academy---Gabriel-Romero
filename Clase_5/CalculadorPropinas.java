package Clase_5;

import java.util.Scanner;

public class CalculadorPropinas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor ingrese el total de la cuenta");
        double totalCuenta = scanner.nextDouble();

        System.out.println("Porfavor ingrese el porcentaje de propina que desea dejar");
        int porcentajePropina = scanner.nextInt();

        double calculadoPropina = calculador(totalCuenta,porcentajePropina);
        System.out.printf("El monto total de la propina es de %.2f",calculadoPropina);
    }

    public static double calculador(double num, int porcentaje ){
        double montoPropina = (num * porcentaje) / 100;
        return montoPropina;
    }
}
