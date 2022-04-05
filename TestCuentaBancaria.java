public class TestCuentaBancaria {
    
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria("Luciano");
        CuentaBancaria cuenta2 = new CuentaBancaria("Pablo");

        cuenta1.hacerDeposito("cuentaCorriente", 100.41);
        cuenta1.hacerRetiro("cuentaCorriente", 50.08);
        cuenta1.hacerDeposito("cuentaAhorros", 200.54);


        cuenta2.hacerDeposito("cuentaAhorros", 45.65);
        cuenta2.hacerRetiro("cuentaAhorros", 25.50);

        System.out.println(CuentaBancaria.getCuentasCreadas());
        System.out.println(cuenta1.getSaldoCuentaCorriente());
        System.out.println(cuenta2.getCuentaAhorros());
        double totalBanco= CuentaBancaria.getTotalCuenta();
        System.out.println("El banco tiene en total :"+ totalBanco);
        cuenta1.verCuentas();

    }
}
