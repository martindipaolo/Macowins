public class Liquidacion implements IEstado {
    @Override
    public double precioFinal(double precioBase) {
        return precioBase*0.5;
    }
}
