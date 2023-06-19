package Clase_10;

public class CuentaDatos {
    public static void main(String[] args){
        Cuenta cuenta = new Cuenta("Gabriel",200.50);
        System.out.println(cuenta.mostrar());
        cuenta.ingresar(0);
        System.out.println(cuenta.mostrar());
        cuenta.ingresar(200.50);
        System.out.println(cuenta.mostrar());
        cuenta.retirar(402);
        System.out.println(cuenta.mostrar());
    }

}
