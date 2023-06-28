package Clase_12;

import java.util.Scanner;

public class Calculadora_Cambio {
    public static void main(String[] args){

        float dineroDisponible = dineroIngresado();
        float valorProducto = getValorProducto();

        float cambio = valorProducto - dineroDisponible;

        if (valorProducto == dineroDisponible){
            System.out.println("No necesitas cambio");
        }

        if (dineroDisponible < valorProducto){
            System.out.println("No te alcanza, vuelve en otro momento");
        }

        if (dineroDisponible > valorProducto){
            System.out.println("Te deben dar " + (cambio * -1) + " de cambio");
        }

    }

    private static float getValorProducto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingrese el valor del producto");
        return scanner.nextFloat();
    }

    public static float dineroIngresado(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor ingrese cuanto dinero posee");
        return scanner.nextFloat();
    }
}
