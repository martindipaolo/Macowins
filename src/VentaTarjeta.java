public class VentaTarjeta extends Venta {

    double coeficiente;
    int cuotas;

    public VentaTarjeta(double coeficiente, int cuotas){
        super();
        this.coeficiente = coeficiente;
        this.cuotas = cuotas;
    }

    @Override
    protected double conRecargo(double totalBase) {
        return this.coeficiente*this.cuotas + 1.01*totalBase;
    }

}
