public class Tarjeta implements ITipoDePago {

    double coeficiente;
    int cuotas;

    public Tarjeta(double coeficiente, int cuotas){
        this.coeficiente = coeficiente;
        this.cuotas = cuotas;
    }

    @Override
    public double recargo(double valorPrendas) {
        return this.coeficiente*this.cuotas + 0.01*valorPrendas;
    }
}
