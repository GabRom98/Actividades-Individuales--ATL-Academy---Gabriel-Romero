package Clase_12;

import java.util.ArrayList;
import java.util.List;

public class Notas_Alumnos {
    public static void main(String[] args){
        Alumno_Clase Alumno_1 = new Alumno_Clase();

        System.out.println(Alumno_1.getNotas());
        List<Double> notasAlumno = new ArrayList<Double>();

        Alumno_1.setNotas(notasAlumno);
        System.out.println(Alumno_1.getNotas());

        notasAlumno.add(8.0);
        notasAlumno.add(7.0);
        notasAlumno.add(9.0);
//        Alumno_1.setNotas(notasAlumno);
        System.out.println(Alumno_1.getNotas());

        Alumno_1.setNombre("Gabriel");
        Alumno_1.setApellido("Romero");
        System.out.println(Alumno_1.toString());

        System.out.println(Alumno_1.promedioNotas());

        Alumno_Clase alumno_2 = new Alumno_Clase("Abi","Pil",notasAlumno);
        System.out.println(alumno_2.toString());
        System.out.println(alumno_2.promedioNotas());
    }
}
