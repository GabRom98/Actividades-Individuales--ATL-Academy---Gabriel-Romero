package Clase_12;

import java.util.Scanner;

public class Interes_Compuesto {
    public static void main(String[] args){
        float capitalInicial = capitalInicial();
        float adicionAnual = cantidadQueSumasAtuCapitalInicialPorAño();
        int años = añosDeInversion();
        float tasaInteres = tasaDeInteres();

        float montoFinal = calcularMontoFinal(capitalInicial, adicionAnual, años, tasaInteres);
        System.out.println("El monto final acumulado es: $" + montoFinal);
    }

    public static float capitalInicial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su capital inical porfavor");
        return scanner.nextFloat();
    }

    public static float cantidadQueSumasAtuCapitalInicialPorAño(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cuanto capital suma por año");
        return scanner.nextFloat();
    }

    public static int añosDeInversion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese por cuantos años invertira");
        return scanner.nextInt();
    }

    public static float tasaDeInteres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la tasa de interes que tendra de ganancia");
        return scanner.nextFloat();
    }

    public static float calcularMontoFinal(float capitalInicial, float adicionAnual, int años, float tasaInteres) {
        float montoFinal = capitalInicial;
        for (int i = 0; i < años; i++) {
            montoFinal += adicionAnual;
            montoFinal = montoFinal * (1 + (tasaInteres / 100));
        }
        return montoFinal;
    }
}
