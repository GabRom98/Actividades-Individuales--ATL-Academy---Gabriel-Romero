package Clase_6;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args){
        int num1 = numeroIngresado();
        int num2 = numeroIngresado();
        int num3 = numeroIngresado();

        int mayor = numeroMayor(num1,num2,num3);

        System.out.println("El numero mayor es: " + mayor);

        int menor = numeroMenor(num1,num2,num3);

        System.out.println("El numero menor es: " + menor);

    }
    static public int numeroIngresado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingrese un numero");
        int num = scanner.nextInt();
        return num;
    }

    static public int numeroMayor(int num1,int num2, int num3){
        int mayor = num1;

        if (num2 > mayor){
            mayor = num2;
        }

        if (num3 > mayor){
            mayor = num3;
        }

        return mayor;
    }

    static public int numeroMenor(int num1,int num2, int num3){
        int menor = num1;

        if (num2 < menor){
            menor = num2;
        }

        if (num3 < menor){
            menor = num3;
        }

        return menor;
    }

}
