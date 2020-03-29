public class Promocion implements IEstado {

    private double descuento;

    public Promocion(double descuento){
        this.descuento = descuento;
    }

    @Override
    public double precioFinal(double precioBase) {
        return precioBase - this.descuento;
    }

}
