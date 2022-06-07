package encapsulamiento_y_visibilidad;

public class Cuenta {
	private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    
    public boolean retirar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public double getSaldo() {
    	return this.saldo;    	
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia(int agencia) {
    	if(agencia > 0) {
    		this.agencia = agencia;    		
    	} else {
    		System.out.println("no están permitidos números negativos");
    	}        
    }
    
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}