public class Main {

    public static void main(String[] args) {

        Prenda saco = new Prenda(TipoPrenda.SACO, new Nuevo(), 20);
        saco.cambiarEstado(new Liquidacion());
        Prenda pantalon = new Prenda(TipoPrenda.PANTALON, new Nuevo(), 10);
        Prenda camisa = new Prenda(TipoPrenda.CAMISA, new Promocion(3), 15);
        Prenda saco2 = new Prenda(TipoPrenda.SACO, new Promocion(8), 25);

        Venta v1 = new Venta(new Efectivo());
        v1.agregarPrenda(saco);
        v1.agregarPrenda(pantalon);
        v1.agregarPrenda(camisa);
        v1.agregarPrenda(saco2);

        Venta v2 = new Venta(new Tarjeta(0.2,12));
        v2.agregarPrenda(saco);
        v2.agregarPrenda(pantalon);
        v2.agregarPrenda(camisa);
        v2.agregarPrenda(saco2);

        RegistroVentas registro = new RegistroVentas();
        registro.agregarVenta(v1);
        registro.agregarVenta(v2);
        System.out.println(registro);


    }
}

