package tiendadeelectrodomesticos;
/*
 @author Alan97
 */
public class Lavadora extends Electrodomestico {
    static final int CARGA_POR_DEF = 5;
    
    private int carga;
    
    public Lavadora() {
        
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase,COLOR_POR_DEF, CONSUMO_POR_DEF, peso);
        this.carga = CARGA_POR_DEF;
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
    @Override
    public double precioFinal() {
        double aux = super.precioFinal();
        if (this.carga > 30) {
            aux += 50;
        }
        return aux;
    }
}
