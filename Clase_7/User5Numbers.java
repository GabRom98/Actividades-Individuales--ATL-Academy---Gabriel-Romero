package Clase_7;

import java.util.Scanner;

public class User5Numbers {
    public static void main(String[] args){

        int[] numeros = traerListadoDeNumerosCargadosPorUsuario();

        mostrarNumeros(numeros);

        mostrarMenor(numeros);

        mostrarMayor(numeros);

        promedio(numeros);
    }

    private static void promedio(int[] numeros) {
        float suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma += numeros[i];
        }
        float promedio = suma / numeros.length;
        System.out.println( "La suma de los numeros es de: " + suma + "\n" + "El promedio de los numeros ingresados es de: " + promedio);
    }

    private static void mostrarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    private static void mostrarMenor(int[] numeros) {
        int menor = 0;
        for (int i = 0; i < numeros.length; i++){
            if (menor == 0 || numeros[i] < menor){
                menor = numeros[i];
            }
        }
        System.out.println("El numero menor es: " + menor);
    }

    public static void mostrarMayor(int[] numeros){
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (mayor == 0 || numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }

    public static int[] traerListadoDeNumerosCargadosPorUsuario(){
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Porfavor ingrese un numero");
            int numeroIngresado = scanner.nextInt();

            numeros[i] = numeroIngresado;
        }
        return numeros;
    }
}
