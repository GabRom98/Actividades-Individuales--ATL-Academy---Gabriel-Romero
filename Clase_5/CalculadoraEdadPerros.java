package Clase_5;

import java.util.Scanner;

public class CalculadoraEdadPerros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro");
        Integer edadPerro = scanner.nextInt();

        Integer añosHumanos= Calculador(edadPerro);
        System.out.println("La edad : " + edadPerro + " en años humanos es " + añosHumanos);
    }

    private static Integer Calculador (Integer num){
        Integer conversion = num * 7;
        return conversion;
    }
}
