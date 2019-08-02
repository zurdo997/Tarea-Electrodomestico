package tiendadeelectrodomesticos;
/*
@author Alan97
 */
public class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.color = "blanco";
        this.consumoEnergetico = 'c';
        this.precioBase = 100;
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'c';
    }

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
