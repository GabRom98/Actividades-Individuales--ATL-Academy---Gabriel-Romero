package Clase_8;

public class GeneradorContraseñas {
    public static void main(String[] args){
        char[] alfabetoMayusMinus = generadorLetrasMayus();
        alfabetoMayusMinus = generadorLetrasMinus(alfabetoMayusMinus);
        generadorContrasenia(alfabetoMayusMinus);
    }

    public static char[] generadorLetrasMayus(){
        char[] alfabeto = new char[52];

        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('A' + i);
        }
        return alfabeto;
    }
    public static char[] generadorLetrasMinus(char[] alfabeto){
        for (int i = 26; i < 52; i++) {
            alfabeto[i] = (char) ('a' + (i - 26));
        }
        return alfabeto;
    }
    public static int generadorNumeros(){
        return (int) Math.floor(Math.random()*10);
    }
    public static void generadorContrasenia(char[] letraMayusMinus){
        String contrasenia = "";
        for (int i = 0 ; contrasenia.length() < 6; i++){
            contrasenia += letraMayusMinus[(int) Math.floor(Math.random()*52)];
        }
        for (int i = 0 ; contrasenia.length() < 12 ; i++){
            contrasenia += generadorNumeros();
        }

        System.out.println("Su contraseña generada es: " + contrasenia);
    }
}
