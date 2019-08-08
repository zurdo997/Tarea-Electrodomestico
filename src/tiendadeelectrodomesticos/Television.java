package tiendadeelectrodomesticos;
/**
 * 
 * @author Alan97
 */
public class Television extends Electrodomestico {

    static final int RESOLUCION_POR_DEF = 20;
    static final boolean SINTONIZADOR_POR_DEF = false;

    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = RESOLUCION_POR_DEF;
        this.sintonizadorTDT = SINTONIZADOR_POR_DEF;
    }

    /**
     * Constructor con dos parametros y el resto por defecto
     * @param precioBase
     * @param peso 
     */
    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_POR_DEF;
        this.sintonizadorTDT = SINTONIZADOR_POR_DEF;
    }

    /**
     * Constructor con todos los parametros
     * @param resolucion
     * @param sintonizadorTDT
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso 
     */
    public Television(int resolucion, boolean sintonizadorTDT, double precioBase, Color color, char consumoEnergetico, double peso) {
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

    /**
     * Este metodo sobreescribe el metodo precio final de la clase padre Electrodomestico
     * @return retorna el precio final segun su resolucion y si tiene o no sintonizador TDT
     */
    @Override
    public double precioFinal() {
        double aux = super.precioFinal();
        if (this.resolucion > 40) {
            aux += this.precioBase * 0.30;
        }
        if (sintonizadorTDT) {
            aux += 50;
        }
        return aux;
    }
}
