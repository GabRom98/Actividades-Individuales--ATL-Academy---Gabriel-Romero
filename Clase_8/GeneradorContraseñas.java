package Clase_8;

public class GeneradorContraseñas {

    public static final int LETRAS_ALFABETO_MAYUSCULA_MINUSCULA = 52;
    public static final int LETRAS_MAYUSCULAS = 26;

    public static void main(String[] args){
        char[] alfabetoMayusMinus = generadorLetrasMayus();
        alfabetoMayusMinus = generadorLetrasMinus(alfabetoMayusMinus);
        generadorContrasenia(alfabetoMayusMinus);
    }

    public static char[] generadorLetrasMayus(){
        char[] alfabeto = new char[LETRAS_ALFABETO_MAYUSCULA_MINUSCULA];

        for (int i = 0; i < LETRAS_MAYUSCULAS; i++) {
            alfabeto[i] = (char) ('A' + i);
        }
        return alfabeto;
    }
    public static char[] generadorLetrasMinus(char[] alfabeto){
        for (int i = LETRAS_MAYUSCULAS; i < LETRAS_ALFABETO_MAYUSCULA_MINUSCULA; i++) {
            alfabeto[i] = (char) ('a' + (i - LETRAS_MAYUSCULAS));
        }
        return alfabeto;
    }
    public static int generadorNumeros(){
        return (int) Math.floor(Math.random()*10);
    }
    public static void generadorContrasenia(char[] letraMayusMinus){
        String contrasenia = "";
        for (int i = 0 ; contrasenia.length() < 6; i++){
            contrasenia += letraMayusMinus[(int) Math.floor(Math.random()*LETRAS_ALFABETO_MAYUSCULA_MINUSCULA)];
        }
        for (int i = 0 ; contrasenia.length() < 12 ; i++){
            contrasenia += generadorNumeros();
        }

        System.out.println("Su contraseña generada es: " + contrasenia);
    }
}
