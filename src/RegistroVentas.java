import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RegistroVentas {

    private LocalDate fecha;
    private List<Venta> ventasDelDia = new ArrayList<Venta>();

    public RegistroVentas(){
        this.fecha = LocalDate.now();
    }

    public void agregarVenta(Venta v){
        if(v.getFecha().equals(this.fecha)){
            this.ventasDelDia.add(v);
            return;
        }
        System.out.println("No puede agregarse una venta de otro dia");
    }

    public double gananciaDelDia(){
        double ganancia = 0;
        for (Venta v : this.ventasDelDia) {
            ganancia += v.totalVenta();
        }
        return ganancia;
    }

    private String imprimirVentas(){
        String s = "";
        for (Venta v : this.ventasDelDia) {
            s += v.toString();
        }
        return s;
    }

    @Override
    public String toString(){
        return "REGISTRO DEL DIA\nFecha: " + this.fecha + "\nGanancia total: " + this.gananciaDelDia() + "\nDetalle:\n" + this.imprimirVentas();
    }

}
