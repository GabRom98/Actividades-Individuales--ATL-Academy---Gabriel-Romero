package Clase_5;
import java.util.Scanner;
public class ConversorMillasKm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingrese una distancia en millas");
        double millas = scanner.nextDouble();

        double conversion = kilometros(millas);

        System.out.printf("La distancia recorrida de millas a km es de %.2f",conversion);
    }
    public static double kilometros(double num){
        double conversion = num * 1.60934;
        return conversion;
    }
}
