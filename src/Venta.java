import java.time.LocalDate;
import java.util.*;

abstract class Venta {

    private LocalDate fecha;
    private List<Prenda> prendasVendidas = new ArrayList<Prenda>();

    public Venta(){
        this.fecha = LocalDate.now();
    }

    // TEMPLATE METHOD
    abstract protected double conRecargo(double importeBase);
    public double totalVenta(){

        double valorPrendas = 0;

        for (Prenda p : this.prendasVendidas) {
            valorPrendas += p.precioFinal();
        }

        return conRecargo(valorPrendas);
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public void agregarPrenda(Prenda p){
        this.prendasVendidas.add(p);
    }

    public int cantidadVendida(){
        return this.prendasVendidas.size();
    }

    private String imprimirPrendas(){
        String s = "";
        for (Prenda p : this.prendasVendidas) {
            s += p.toString() + "\n";
        }
        return s;
    }

    @Override
    public String toString(){
        return "VENTA\nFecha: " + this.fecha + "\nCantidad: " + this.cantidadVendida() + "\nTotal: " + this.totalVenta() + "\nPrendas:\n" + this.imprimirPrendas();
    }


}
