package tiendadeelectrodomesticos;
/**
 * 
 * @author Alan97
 */
public class Lavadora extends Electrodomestico {
    static final int CARGA_POR_DEF = 5;
    
    private int carga;
    
    /**
     * Constructor por defecto
     */
    public Lavadora() {
        super();
        this.carga = CARGA_POR_DEF;
    }

    /**
     * Constructor con dos parametros y el resto pro defecto
     * @param precioBase
     * @param peso 
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_POR_DEF;
    }
    
    /**
     * Constructor con todos los parametros
     * @param carga
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso 
     */
    public Lavadora(int carga, double precioBase, Color color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    /**
     * 
     * @return retorna la carga del electrodomestico
     */
    public int getCarga() {
        return carga;
    }
    
    /**
     * Este metodo sobreescribe el metodo precio final de la clase padre Electrodomestico
     * @return retorna el precio final modificado segun la carga de la lavadora
     */
    @Override
    public double precioFinal() {
        double aux = super.precioFinal();
        if (this.carga > 30) return aux + 50;
        return aux;
    }
}
