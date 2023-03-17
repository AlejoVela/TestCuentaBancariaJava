public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
      this.saldo = saldo;
      this.tasaAnual = tasaAnual;
    }
    public void Consignar(float saldo){
      this.saldo += Math.abs(saldo);
      this.numeroConsignaciones++;
    }
    public void Retirar(float saldo) {
      if(saldo <= this.saldo){
        this.saldo -= saldo;
        this.numeroRetiros++;
      }
    }
    public void CalcularInteresMensual(){
      this.comisionMensual = (this.tasaAnual/12)*saldo;
    }
    public void ExtractoMensual(){
      CalcularInteresMensual();
      this.saldo -= this.comisionMensual;
    }
    public void Imprimir(){
      String message = "Saldo: " + this.saldo + "\n" +
        "Numero consignaciones: " + this.numeroConsignaciones +  "\n" +
        "Numero Retiros: " + this.numeroRetiros  + "\n" +
        "Tasa Anual: " + this.tasaAnual  + "\n" +
        "Comision Mensual: " + this.comisionMensual + "\n";

      System.out.println(message);
    }
}
