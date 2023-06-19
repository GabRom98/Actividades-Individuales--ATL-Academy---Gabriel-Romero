package Clase_10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaDeNacimiento;
    private int dni;

    public Persona(int id,String nombre,String apellido,int edad,String fechaDeNacimiento,int dni){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaDeNacimiento = parseFecha(fechaDeNacimiento);
        this.dni = dni;
    }

    private LocalDate parseFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(fecha, formatter);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", dni=" + dni +
                '}';
    }

    public boolean esMayorDeEdad(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaMayorEdad = fechaDeNacimiento.plusYears(18);

        return fechaMayorEdad.isBefore(fechaActual) || fechaMayorEdad.isEqual(fechaActual);
    }

}
