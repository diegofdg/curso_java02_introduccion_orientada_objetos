package definiendo_comportamientos;

public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.saldo = 300;
        
        cuentaDeDiego.depositar(200);
        System.out.println(cuentaDeDiego.saldo);
        
        cuentaDeDiego.retirar(100);
        System.out.println(cuentaDeDiego.saldo); 

        Cuenta cuentaDeJimena = new Cuenta();
        cuentaDeJimena.depositar(1000);
        
        boolean puedeTransferir = cuentaDeJimena.transferir(400, cuentaDeDiego);
        if(puedeTransferir) {
            System.out.println("transferencia exitosa");
        } else {
            System.out.println("no es posible");
        }        
	}
}