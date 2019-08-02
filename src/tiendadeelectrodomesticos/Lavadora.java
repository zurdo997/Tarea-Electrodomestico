package tiendadeelectrodomesticos;
/*
 @author Alan97
 */
public class Lavadora extends Electrodomestico {
    private int carga;
    
    public Lavadora() {
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    
}
