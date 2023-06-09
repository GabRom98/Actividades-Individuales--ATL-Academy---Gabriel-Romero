package Clase_6;

public class Numeros1_100 {
    public static void main(String[] args){
        String numeros = "Los numeros del 1 al 100 son: ";

        int contador= 0;

        while(contador<100){
            contador++;
            numeros+= "\n" + contador;
        }
        System.out.println(numeros);
    }
}
