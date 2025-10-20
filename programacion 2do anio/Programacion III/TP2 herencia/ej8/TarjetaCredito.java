
public class TarjetaCredito {

  private TipoEntidad entidadFinanciera;
  private String entidadBancaria;
  private String numTarjeta;
  private double saldo;
  private Titular titular;
  

  public TarjetaCredito(TipoEntidad entidadFinanciera, String entidadBancaria, String numTarjeta, double saldo, Titular titular) {
    this.entidadFinanciera = entidadFinanciera;
    this.entidadBancaria = entidadBancaria;
    this.numTarjeta = numTarjeta;
    this.saldo = saldo;
    this.titular = titular;
  }
  
  public TipoEntidad getEntidadFinanciera() {
    return entidadFinanciera;
  }
  public void setEntidadFinanciera(TipoEntidad entidadFinanciera) {
    this.entidadFinanciera = entidadFinanciera;
  }
  public String getEntidadBancaria() {
    return entidadBancaria;
  }
  public void setEntidadBancaria(String entidadBancaria) {
    this.entidadBancaria = entidadBancaria;
  }
  public String getNumTarjeta() {
    return numTarjeta;
  }
  public void setNumTarjeta(String numTarjeta) {
    this.numTarjeta = numTarjeta;
  }
  public double getSaldo() {
    return saldo;
  }
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public Titular getTitular() {
    return titular;
  }

  public void setTitular(Titular titular) {
    this.titular = titular;
  }
  

}