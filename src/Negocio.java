import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Negocio {

    private List<Venta> ventas = new ArrayList<Venta>();

    public void agregarVenta(Venta v){
            this.ventas.add(v);
    }

    public double gananciaDeUnDia(LocalDate unDia){
        double ganancia = 0;
        for (Venta v : this.ventas) {
            if(v.esVentaDelDia(unDia))
                ganancia += v.totalVenta();
        }
        return ganancia;
    }

    private String ventasDeUnDia(LocalDate unDia){
        String s = "";
        for (Venta v : this.ventas) {
            if(v.esVentaDelDia(unDia))
                s += v.toString();
        }
        return s;
    }

    public void imprimirVentasDeUnDia(LocalDate unDia){
        System.out.println("REGISTRO DEL DIA\nFecha: " + unDia + "\nGanancia total: " + this.gananciaDeUnDia(unDia) + "\nDetalle:\n" + this.ventasDeUnDia(unDia));
    }

}
