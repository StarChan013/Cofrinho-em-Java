package cofrinho;

public class Real extends Moeda {
	
	public Real(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String info() {
		return String.format("R$%.2f", this.valor);
	}
	
	@Override
	public double converter(double valor) {
		return valor; //Nada a converter
	}
	
	
}
