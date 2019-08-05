package tiendadeelectrodomesticos;

/*
@author Alan97
 */
public class Electrodomestico {

    //Constantes
    static final double PRECIO_POR_DEF = 100;
    static final String COLOR_POR_DEF = "blanco";
    static final char CONSUMO_POR_DEF = 'F';
    static final double PESO_POR_DEF = 5;

    //Atributos de la SuperClase
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    //Constructor por defecto
    public Electrodomestico() {
        /*
        this(PRECIO_POR_DEF, COLOR_POR_DEF, CONSUMO_POR_DEF, PESO_POR_DEF);*/
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

    @Override
    public String toString() {
        return "Electrodomestico \n" + 
               "Precio Base: " + precioBase + "$ \n"+
               "Color: " + color + '\n' + 
               "Consumo Energetico: " + consumoEnergetico + '\n'+ 
               "Peso: " + peso + "kg \n";
    }
    
    public void comprobarConsumoEnergetico(char consumo) {
        if (Character.isLetter(consumo)) {
            if (consumo >= 'a' && consumo <= 'f' || consumo >= 'A' && consumo <= 'F') {
                consumo = consumoEnergetico;
            } else {
                consumo = CONSUMO_POR_DEF;
            }
        }
    }

    public void comprobarColor(String color) {
        String coloresDisponibles[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean bandera = false;

        for (int i = 0; i < coloresDisponibles.length && !bandera; i++) {

            if (coloresDisponibles[i].equals(color)) {
                bandera = true;
            }

        }

        if (bandera) {
            this.color = color;
        } else {
            this.color = COLOR_POR_DEF;
        }
    }

    public double precioFinal() {
        double precioFinal = 0;
        double sumador = 0;

        switch (this.consumoEnergetico) {
            case 'A':
                sumador += 100;
                break;
            case 'B':
                sumador += 80;
                break;
            case 'C':
                sumador += 60;
                break;
            case 'D':
                sumador += 50;
                break;
            case 'E':
                sumador += 30;
                break;
            case 'F':
                sumador += 10;
                break;
        }
        if (this.peso >= 0 && this.peso < 19) {
            sumador += 10;
        } else if (this.peso >= 20 && this.peso < 49) {
            sumador += 50;
        } else if (this.peso >= 50 && this.peso <= 79) {
            sumador += 80;
        } else {
            sumador += 100;
        }
        precioFinal = this.precioBase + sumador;
        
        return precioFinal;
    }
}
