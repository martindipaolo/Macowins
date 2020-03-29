public class Prenda {
    private TipoPrenda tipo;
    private IEstado estado;
    private double precioBase;

    public Prenda(TipoPrenda tipo, IEstado estado, double precioBase){
        this.tipo = tipo;
        this.estado = estado;
        this.precioBase = precioBase;
    }

    public double precioFinal(){
        return estado.precioFinal(precioBase);
    }

    public TipoPrenda tipo(){
        return tipo;
    }

    public void cambiarEstado(IEstado nuevoEstado){
        this.estado = nuevoEstado;
    }

    @Override
    public String toString(){
        return "PRENDA\n\tTipo: " + this.tipo + "\n\tPrecio base: " + this.precioBase + "\n\tPrecio final: " + this.precioFinal();
    }
}
