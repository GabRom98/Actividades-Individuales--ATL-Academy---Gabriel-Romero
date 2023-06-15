package Clase_8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args){
        double[] cuadrado = TamañoLadoIngresadosPorUsuario();
        mostrarLados(cuadrado);
        calcularArea(cuadrado);
    }

    public static double[] TamañoLadoIngresadosPorUsuario(){
        Scanner scanner = new Scanner(System.in);
        double[] ladosCuadrado = new double[2];
        for (int i=0; i<2 ; i++){
            System.out.println("Ingrese la longitud de un lado del cuadrado");
            double tamañoIngresado = scanner.nextDouble();
            ladosCuadrado[i] = tamañoIngresado;
        }
        return ladosCuadrado;
    }

    public static void mostrarLados(double[] nums){
        for (int i=0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void calcularArea(double[] nums){
        System.out.println(nums[0] * nums[1]);
    }
}