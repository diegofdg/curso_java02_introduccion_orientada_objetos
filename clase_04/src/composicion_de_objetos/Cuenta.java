package composicion_de_objetos;

public class Cuenta {
	double saldo;
    int agencia;
    int numero;
    Cliente titular = new Cliente();
    
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
}