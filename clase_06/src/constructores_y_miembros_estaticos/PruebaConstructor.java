package constructores_y_miembros_estaticos;

public class PruebaConstructor {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(555,1234);
		Cuenta cuenta2 = new Cuenta(333,5678);
		Cuenta cuenta3 = new Cuenta(444,951);
		
		System.out.println(cuenta);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		
		System.out.println(Cuenta.getTotal() + " cuentas creadas correctamente");
	}
}