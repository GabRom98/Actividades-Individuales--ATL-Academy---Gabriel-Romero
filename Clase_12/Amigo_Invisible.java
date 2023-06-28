package Clase_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Amigo_Invisible {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Porfavor ingrese la cantidad de personas que van a participar");
        int cantidadPersonas = scanner.nextInt();
        for (int i=0; cantidadPersonas % 2 != 0 ;i++){
            System.out.println("Porfavor; ingrese un numero par, no se puede recibir 2 veces regalo");
            cantidadPersonas = scanner.nextInt();
        }

        List<String> personas = new ArrayList<String>();
        List<String> personasSinAmigoImaginario = new ArrayList<String>();

        for (int i=0; i < cantidadPersonas; i++){
            System.out.println("Ingrese un nombre porfavor");
            String persona = scanner.next();
            personas.add(persona);
            personasSinAmigoImaginario.add(persona);
        }

        Random numRandom = new Random();

        for(String participante : personas){
            int index = numRandom.nextInt(personasSinAmigoImaginario.size());

            while (participante.equals(personasSinAmigoImaginario.get(index))) {
                index = numRandom.nextInt(personasSinAmigoImaginario.size());
            }

            System.out.println(participante + " debe darle un regalo a " + personasSinAmigoImaginario.get(index));
            personasSinAmigoImaginario.remove(index);
        }

    }
}
