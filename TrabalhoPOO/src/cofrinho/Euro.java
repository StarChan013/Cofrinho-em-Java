package cofrinho;

public class Euro extends Moeda {
	
	public Euro(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String info() {
		return String.format("€%.2f", this.valor); //Convertor para uma lista mais agradável
	}
	
	@Override
	public double converter(double valor) {
		return valor * 5.55; //Cotação de 14/05
	}
}
