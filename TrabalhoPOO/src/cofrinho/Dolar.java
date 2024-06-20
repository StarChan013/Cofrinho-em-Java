package cofrinho;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String info() {
		return String.format("U$%.2f", this.valor); //Convertor para uma lista mais agradável
	}
	
	@Override
	public double converter(double valor) {
		return valor * 5.16; //Cotação de 14/05
	}
}
