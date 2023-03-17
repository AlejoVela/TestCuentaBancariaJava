public class CuentaCorriente extends Cuenta {
    private float SobreGiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void Retirar(float saldo) {
        if(saldo <= this.saldo){
            this.saldo -= saldo;
            this.numeroRetiros++;
        } else {
            this.SobreGiro += Math.abs(this.saldo - saldo);
            this.saldo = 0;
        }
    }
    @Override
    public void Consignar(float saldo) {
        if(this.SobreGiro > 0){
            if(saldo > this.SobreGiro){
                this.saldo += Math.abs(this.SobreGiro - saldo);
                this.SobreGiro = 0;
            } else {
                this.SobreGiro -= saldo;
            }
            this.numeroConsignaciones++;
        } else {
            super.Consignar(saldo);
        }
    }

    @Override
    public void Imprimir(){
        String message = "Saldo: " + this.saldo + "\n" +
                "Comision Mensual: " + this.comisionMensual + "\n" +
                "Numero de transacciones: " + (this.numeroConsignaciones + this.numeroRetiros) + "\n" +
                "Valor Sobregiro: " + this.SobreGiro;

        System.out.println(message);
    }

}
