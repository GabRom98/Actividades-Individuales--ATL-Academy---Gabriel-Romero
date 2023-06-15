package Clase_9;

import java.util.Arrays;
import java.util.Scanner;

public class BuscadorPersonas {
    public static void main (String[] args){
        String[] personas = {"Gabriel Romero", "Abi B", "Luks Sanchez", "Tomas Belizan", "Luciana Chazarreta"};

        System.out.println("Ingrese su busqueda");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();


        Arrays.stream(personas).filter(nombre -> nombre.contains(busqueda));

      /*  for (String nombrePersona : personas){
            if (nombrePersona.contains(busqueda)){
                System.out.println("La persona es: " + nombrePersona);
            }
        }*/


       /* for (int i = 0 ; i<personas.length;i++){
            String personaEncontrada = personas [i];
            if (busqueda.equals(personaEncontrada)){
                System.out.println("La persona es: " + personaEncontrada);
            }
        }*/

    }
}
