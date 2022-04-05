
public class CuentaBancaria{

    private String nombreCliente;
    private double saldoCuentaCorriente;
    private double saldoCuentaAhorros;
    private static double totalCuenta;
    private static int numCuentasCreadas = 0;
    
    

    public CuentaBancaria(String usuario){
        this.nombreCliente = usuario;
        this.saldoCuentaCorriente = 0;
        this.saldoCuentaAhorros = 0;
        totalCuenta = this.saldoCuentaAhorros + this.saldoCuentaCorriente;
        numCuentasCreadas++;
        
    }
    
    public static int getCuentasCreadas(){
        return numCuentasCreadas;
    }

    public double getSaldoCuentaCorriente(){
        return saldoCuentaCorriente;
    }

    public static double getTotalCuenta(){
        return totalCuenta;
    }

    public double getCuentaAhorros(){
        return saldoCuentaAhorros;
    }

    public void hacerDeposito(String tipoCuenta, double cantidad){
        if(tipoCuenta == "cuentaCorriente"){
            saldoCuentaCorriente += cantidad;
            totalCuenta += cantidad;
        }
        else if(tipoCuenta == "cuentaAhorros") {
            saldoCuentaAhorros += cantidad;
            totalCuenta += cantidad;
        }
        
    }


    
    public void hacerRetiro(String tipoCuenta, double cantidad){
        if(tipoCuenta == "cuentaCorriente"){
            if(saldoCuentaCorriente < cantidad) {
                System.out.println("Fondos Insuficientes");
            } else {
                this.saldoCuentaCorriente -= cantidad;
                totalCuenta -= cantidad;
            }
        }
        else if (tipoCuenta == "cuentaAhorros") {
            if(saldoCuentaAhorros < cantidad) {
                System.out.println("Fondos Insuficientes");
            } else {
                this.saldoCuentaAhorros -= cantidad;
                totalCuenta -= cantidad;
            }
        }
        
        
    }   

    public void verCuentas(){
        
        System.out.printf("Cliente: %s\n", this.nombreCliente);
        System.out.printf("Cuenta de Ahorros: %s\n", this.saldoCuentaAhorros);
        System.out.printf("Cuenta Corriente: %s\n", this.saldoCuentaCorriente);
    }
}