package Clase_10;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular,double cantidad){
        this.titular=titular;
        this.cantidad= cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    private void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String mostrar() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidad){
        if(cantidad<=0){
            return;
        }
        setCantidad(getCantidad()+cantidad);
    }

    public void retirar(double cantidad){
        setCantidad(getCantidad()-cantidad);
    }

}
