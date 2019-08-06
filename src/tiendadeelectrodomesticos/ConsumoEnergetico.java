package tiendadeelectrodomesticos;
/**
 *
 * @author Desarrollo Web
 */
public enum ConsumoEnergetico {
    A(100), B(80), C(60), D(50), E(30), F(10);
    final private int PRECIO_POR_CONSUMO;
    
    private ConsumoEnergetico (int num) {
        PRECIO_POR_CONSUMO = num;
    }

    public int getPRECIO_POR_CONSUMO() {
        return PRECIO_POR_CONSUMO;
    }
}
