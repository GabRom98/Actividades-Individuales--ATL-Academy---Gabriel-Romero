package Clase_12;
import java.util.List;
public class Alumno_Clase {

        private String nombre;
        private String apellido;
        private List<Double> notas;

    // Constructor con parámetros
    public Alumno_Clase(String nombre, String apellido, List<Double> notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    // Constructor sin parámetros
    public Alumno_Clase() {
    }

        public Double promedioNotas(){
            List<Double> notas = getNotas();

            Double notaTotal = 0.0;

            for (Double nota : notas){
                notaTotal += nota;
            }

            return notaTotal / notas.size();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public List<Double> getNotas() {
            return notas;
        }

        public void setNotas(List<Double> notas) {
            this.notas = notas;
        }

    @Override
    public String toString() {
        return "Alumno_Clase{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", notas=" + notas +
                '}';
    }
}

