package Clase_5;

import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Integer numeroRandom = (int)(Math.random()*100+1);
        System.out.println(numeroRandom);

        System.out.println("Porfavor ingrese un numero para adivinar el numero oculto");
        Integer userNum = scanner.nextInt();

        if (numeroRandom == userNum){
            System.out.println("Felicidades adivinaste el numero");
        } else {
            System.out.println("No adivinaste, intente otra vez");
        }
    }
}
