public class VentaEfectivo extends Venta {

    public VentaEfectivo() {
        super();
    }

    @Override
    protected double conRecargo(double totalBase) {
        return totalBase;
    }

}
