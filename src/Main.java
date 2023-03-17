public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente(10000, 0.12f);
        cuenta.Consignar(100000);
        cuenta.Retirar(10000);
        cuenta.Retirar(10000);
        cuenta.Retirar(100000);
        cuenta.CalcularInteresMensual();
        cuenta.ExtractoMensual();
        cuenta.Consignar(20000);
        cuenta.Imprimir();
    }
}