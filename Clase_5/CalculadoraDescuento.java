package Clase_5;
import java.util.Scanner;
public class CalculadoraDescuento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio original del producto porfavor");
        double precioOriginal = scanner.nextDouble();

        System.out.println("Ingrese el % del descuento");
        Integer porcentajeDescuento = scanner.nextInt();

        double precioFinal = calculador(precioOriginal,porcentajeDescuento);

        System.out.printf("El precio final es de %.2f",precioFinal);

    }
    public static double calculador(double num, int porcentajeDes){
       double precioFinal = num - (num * porcentajeDes / 100);
       return precioFinal;
    }

}
