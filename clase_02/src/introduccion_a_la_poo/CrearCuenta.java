package introduccion_a_la_poo;

public class CrearCuenta {
	public static void main(String[] args) {
        //	   Variable      =  Valor
        //     Variable      => 15db9742		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 400;
		// primeraCuenta.pais = "Peru"; no compila
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.saldo = 400;
        
        System.out.println(segundaCuenta.saldo);
        // System.out.println(primeraCuenta.agencia);
        
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
        
        if(primeraCuenta == segundaCuenta) {
        	System.out.println("Son el mismo objeto");
        } else {
        	System.out.println("Son diferentes");
        }
	}
}