package tiendadeelectrodomesticos;
/*
 @author Alan97
 */
public class Lavadora extends Electrodomestico {
    static final int CARGA_POR_DEF = 5;
    
    private int carga;
    
    public Lavadora() {
        super();
        this.carga = CARGA_POR_DEF;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_POR_DEF;
    }

    public Lavadora(int carga, double precioBase, Color color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override
    public double precioFinal() {
        double aux = super.precioFinal();
        if (this.carga > 30) return aux + 50;
        return aux;
    }
}
