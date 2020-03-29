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

    public void imprimir(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Precio base: " + this.precioBase);
        System.out.println("Precio final: " + this.precioFinal());
        System.out.println("***");
    }
}
