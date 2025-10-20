
public class Principal {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Juan", 12345678, "Perez", 987654321, "<EMAIL>");
        TarjetaCredito tarjeta1 = new TarjetaCredito(TipoEntidad.AMERICANEXPRESS, "Banco Provincia", "1234567891234567", 15000, titular1);
        Posnet posnet = new Posnet(tarjeta1, 10000, 5);
        
        titular1.mostrarTitular();
        posnet.efectuarPago();
    }
}
