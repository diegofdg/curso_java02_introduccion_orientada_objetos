package constructores_y_miembros_estaticos;

public class CrearCuenta {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(111,123);
		primeraCuenta.depositar(400);
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(222,234);
        segundaCuenta.depositar(400);
        
        System.out.println(segundaCuenta.getSaldo());        
        
        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
        
        if(primeraCuenta == segundaCuenta) {
        	System.out.println("Son el mismo objeto");
        } else {
        	System.out.println("Son diferentes");
        }
	}
}