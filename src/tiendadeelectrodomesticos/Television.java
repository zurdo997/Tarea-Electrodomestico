package tiendadeelectrodomesticos;
/*
 @author Alan97
 */
public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(int resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    
}
