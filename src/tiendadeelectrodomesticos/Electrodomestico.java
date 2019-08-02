package tiendadeelectrodomesticos;
/*
@author Alan97
 */
public class Electrodomestico {
    //Constantes
    private final static double PRECIO_POR_DEF = 100;
    private final static String COLOR_POR_DEF = "blanco";
    private final static char CONSUMO_POR_DEF = 'F';
    private final static double PESO_POR_DEF = 5;
    
    //Atributos de la SuperClase
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    
    //Constructor por defecto
    public Electrodomestico() {
        this(PRECIO_POR_DEF, COLOR_POR_DEF, CONSUMO_POR_DEF, PESO_POR_DEF);
    }
    
    //Constructor con dos parámetros el resto por defecto
    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, COLOR_POR_DEF, CONSUMO_POR_DEF, peso);
    }
    
    //Constructor con todos los atributos de la clase
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    
    
}
