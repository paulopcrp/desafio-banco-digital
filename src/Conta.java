
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int contaNumero;
	protected double saldo;
	
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.contaNumero = SEQUENCIAL++;
		
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo = saldo - valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo + valor;
		
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getContaNumero() {
		return contaNumero;
	}

	public double getSaldo() {
		return saldo;
	}	

	protected void ImprimirMovConta() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta Numero: %d", this.contaNumero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}		


}