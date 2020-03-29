public class Main {

    public static void main(String[] args) {

        Prenda p = new Prenda(TipoPrenda.SACO, new Nuevo(), 10);
        p.imprimir();

        p.cambiarEstado(new Promocion(4.5));
        p.imprimir();

        p.cambiarEstado(new Liquidacion());
        p.imprimir();

    }
}

