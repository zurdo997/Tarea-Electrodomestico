package tiendadeelectrodomesticos;
/**
 * 
 * @author Alan97
 */
public class Electrodomestico {

    //Constantes
    static final protected double PRECIO_POR_DEF = 100;
    static final protected Color COLOR_POR_DEF = Color.BLANCO;
    static final protected ConsumoEnergetico CONSUMO_POR_DEF = ConsumoEnergetico.F;
    static final protected double PESO_POR_DEF = 5;

    //Atributos de la SuperClase
    protected double precioBase;
    protected Color color; //clase Enum Color
    protected ConsumoEnergetico consumoEnergetico; //clase Enum ConsumoEnergetico
    protected double peso;

    /**
     * Constructor por defecto
     */
    public Electrodomestico() {
        this.precioBase = PRECIO_POR_DEF;
        this.color = COLOR_POR_DEF;
        this.consumoEnergetico = CONSUMO_POR_DEF;
        this.peso = PESO_POR_DEF;
    }

    /**
     * Constructor con dos parámetros el resto por defecto
     * @param precioBase recibe el precio del electrodomestico
     * @param peso recibe el peso del electrodomestico
     * 
     */
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_POR_DEF;
        this.consumoEnergetico = CONSUMO_POR_DEF;
    }

    /**
     * Constructor con todos los parámetros
     * @param precioBase recibe el precio del electrodomestico
     * @param color recibe el color del electrodomestico
     * @param consumoEnergetico recibe el consumo energetico del electrodomestico
     * @param peso recibe el peso del electrodomestico
     */
    public Electrodomestico(double precioBase, Color color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    /**
     * 
     * @return retorna el precio del electrodomestico 
     */
    public double getPrecioBase() {
        return precioBase;
    }
    
    /**
     * 
     * @return retorna el color del electrodomestico 
     */
    public Color getColor() {
        return color;
    }
    
    /**
     * 
     * @return ConsumoEnergetico retorna el consumo energetico del electrodomestico 
     */
    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico \n"
                + "Precio Base: " + precioBase + "$ \n"
                + "Color: " + color + '\n'
                + "Consumo Energetico: " + consumoEnergetico + '\n'
                + "Peso: " + peso + "kg \n";
    }

    /*private void comprobarConsumoEnergetico(char letra) {
        String letraM = Character.toString(letra);
        if (letra >= 'a' && letra <= 'f' || letra >= 'A' && letra <= 'F') {
            ConsumoEnergetico.valueOf(letraM);
        } else {
            this.consumoEnergetico = CONSUMO_POR_DEF;
        }
    }*/
    
    /**
     * Este metodo es para comprobar el consumo
     * @param letra es la letra para comprobar el consumo
     * 
     */
    private void comprobarConsumoEnergetico(char letra) {
        if (Character.toUpperCase(letra) < 'A' || Character.toUpperCase(letra) > 'F') {
            this.consumoEnergetico = CONSUMO_POR_DEF;
        } else {
            this.consumoEnergetico = Enum.valueOf(ConsumoEnergetico.class, Character.toString(letra));
        }
    }
    
    /**
     * Este metodo es para comprobar el color del electrodomestico
     * @param color es el color para comprobar el color
     */
    private void comprobarColor(String color) {
        for (Color i : Color.values()) {
            if (i.name().equals(color.toUpperCase())) {
                this.color = i;
            }
            if (this.color == null) {
                this.color = COLOR_POR_DEF;
            }
        }
    }

    /**
     * 
     * @return retorna el precio final del electrodomestico
     */
    public double precioFinal() {
        return precioBase + this.consumoEnergetico.getPRECIO_POR_CONSUMO() + calcularPrecioPorPeso();
    }

    public double calcularPrecioPorPeso() {
        if (this.peso >= 0 && this.peso <= 19) return 10;
        if (this.peso >= 20 && this.peso <= 49) return 50;
        if (this.peso >= 50 && this.peso <= 79) return 80;
        return 100;
    }
}
