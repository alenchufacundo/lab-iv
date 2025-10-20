public class Posnet{
    private TarjetaCredito tarjeta;
    private double montoOperacion;
    private int cuotas;
    private double montoTotal;
    
    public Posnet(TarjetaCredito tarjeta, double montoOperacion, int cuotas) {
        this.tarjeta = tarjeta;
        this.montoOperacion = montoOperacion;
        this.cuotas = cuotas;
    }

    public double getMontoOperacion() {
        return montoOperacion;
    }

    public void setMontoOperacion(double montoOperacion) {
        this.montoOperacion = montoOperacion;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    

    public TarjetaCredito getTarjetaCredito() {
        return tarjeta;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjeta = tarjetaCredito;
    }

    public void calcularRecargo(){

        switch (getCuotas()) {
            case 1:
                montoTotal=this.montoOperacion;           
                break;
            case 2:
                montoTotal = this.montoOperacion+(this.montoOperacion*0.3);
                System.out.println("Monto Total: " + montoTotal);
                break;
            case 3:
                montoTotal = this.montoOperacion+(this.montoOperacion*0.6);
                System.out.println("Monto Total: " + montoTotal);
                break;
            case 4:
                montoTotal = this.montoOperacion+(this.montoOperacion*0.9);
                System.out.println("Monto Total: " + montoTotal);
                break;
            case 5:
                montoTotal = this.montoOperacion+(this.montoOperacion*0.12);
                System.out.println("Monto Total: " + montoTotal);
                break;    
            case 6:
                montoTotal = this.montoOperacion+(this.montoOperacion*0.15);
                System.out.println("Monto Total: " + montoTotal);
                break;    
            default:
                System.out.println("La operacion no pudo realizarse");
                break;
        }

    }

    public void imprimirTicket(){
        System.out.println("Imprimiendo Ticket");
        System.out.println("Nombre y Apellido: " + tarjeta.getTitular().getNombre() + " " + tarjeta.getTitular().getApellido());
        System.out.println("Monto Total a pagar: " + montoTotal);
        System.out.println("Monto de cada cuota: " + (montoTotal/cuotas));
    }

    public void efectuarPago(){
        calcularRecargo();
        if (tarjeta.getSaldo() >= this.montoTotal && cuotas >= 1 && cuotas <= 6) {
            imprimirTicket();
        }else{
        System.out.println("No tiene saldo suficiente o ingreso una cantidad de cuotas incorrecta");
    }

    }


}
