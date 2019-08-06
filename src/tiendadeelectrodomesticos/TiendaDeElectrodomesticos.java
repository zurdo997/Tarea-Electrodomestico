package tiendadeelectrodomesticos;
/*
@author Alan97
 */
public class TiendaDeElectrodomesticos {

    public static void main(String[] args) {
        Electrodomestico[] misElectrodomesticos;
        misElectrodomesticos = new Electrodomestico[10];
        double sumaDeTelevisores = 0;
        double sumaDeLavadoras = 0;
        double sumaDeElectrodomesticos = 0;
        
        misElectrodomesticos[0] = new Lavadora(35, 4505.50, "negro", 'A', 25);
        misElectrodomesticos[1] = new Television(3560, 25);
        misElectrodomesticos[2] = new Lavadora();
        misElectrodomesticos[3] = new Television(45, true, 2000.50, "blanco", 'C', 18);
        misElectrodomesticos[4] = new Lavadora(3600, 60);
        misElectrodomesticos[5] = new Television();
        misElectrodomesticos[6] = new Television(2500, 70);
        misElectrodomesticos[7] = new Electrodomestico(7000, 63);
        misElectrodomesticos[8] = new Electrodomestico(9560.90, "gris", 'B', 34);
        misElectrodomesticos[9] = new Lavadora(6000, 84);

        for (int i = 0; i < misElectrodomesticos.length; i++) {
            if (misElectrodomesticos[i] instanceof Electrodomestico) {
                sumaDeElectrodomesticos += misElectrodomesticos[i].precioFinal();
            }
            if (misElectrodomesticos[i] instanceof Lavadora) {
                sumaDeLavadoras += misElectrodomesticos[i].precioFinal();
            }
            if (misElectrodomesticos[i] instanceof Television) {
                sumaDeTelevisores += misElectrodomesticos[i].precioFinal();
            }
        }

        System.out.println("La suma de electrodomésticos es: " + sumaDeElectrodomesticos + "$ \n");
        System.out.println("La suma del precio de las lavadoras es de " + sumaDeLavadoras + "$ \n");
        System.out.println("La suma del precio de las televisiones es de " + sumaDeTelevisores + "$ \n");
    }

}
