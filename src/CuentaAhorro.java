public class CuentaAhorro extends Cuenta {
    private boolean EsActiva;

    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.EsActiva = LaCuentaSeMantieneActiva();
    }

    private boolean LaCuentaSeMantieneActiva() {
        return this.saldo >= 10000;
    }

    @Override
    public void Consignar(float saldo){
        if(this.EsActiva){
            super.Consignar(saldo);
        }
    }
    @Override
    public void Retirar(float saldo) {
        if(this.EsActiva){
            super.Retirar(saldo);
        }
    }
    @Override
    public void ExtractoMensual(){
        if(this.numeroRetiros > 4){
            int retirosAdicionales = this.numeroRetiros - 4;
            this.saldo -= 1000*retirosAdicionales;
        } else {
            super.ExtractoMensual();
        }
        LaCuentaSeMantieneActiva();
    }
    @Override
    public void Imprimir(){
        String message = "Saldo: " + this.saldo + "\n" +
                "Comision Mensual: " + this.comisionMensual + "\n" +
                "Numero de transacciones: " + (this.numeroConsignaciones + this.numeroRetiros);

        System.out.println(message);
    }


}
