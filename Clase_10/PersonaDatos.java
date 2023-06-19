package Clase_10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonaDatos {
    public static void main(String[] args){
        Persona persona = new Persona(1, "Gabriel", "Francisco", 17, "12-06-2006", 12345678);

        System.out.println(persona.toString());
        System.out.println(persona.esMayorDeEdad());
    }
}
