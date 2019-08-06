package tiendadeelectrodomesticos;
/*
@author Alan97
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

    //Constructor por defecto
    public Electrodomestico() {
        this.precioBase = PRECIO_POR_DEF;
        this.color = COLOR_POR_DEF;
        this.consumoEnergetico = CONSUMO_POR_DEF;
        this.peso = PESO_POR_DEF;
    }

    //Constructor con dos parámetros el resto por defecto
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR_POR_DEF;
        this.consumoEnergetico = CONSUMO_POR_DEF;
    }

    //Constructor con todos los atributos de la clase
    public Electrodomestico(double precioBase, Color color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    //Getters
    public double getPrecioBase() {
        return precioBase;
    }

    public Color getColor() {
        return color;
    }

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
    private void comprobarConsumoEnergetico(char letra) {
        if (Character.toUpperCase(letra) < 'A' || Character.toUpperCase(letra) > 'F') {
            this.consumoEnergetico = CONSUMO_POR_DEF;
        } else {
            this.consumoEnergetico = Enum.valueOf(ConsumoEnergetico.class, Character.toString(letra));
        }
    }

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
