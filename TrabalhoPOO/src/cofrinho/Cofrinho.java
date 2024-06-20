package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	
	protected ArrayList<Moeda> listaMoedas = new ArrayList<>(); //Criar uma ArrayList de Moedas 
	
	public Cofrinho() {
	}
	
	public void adicionarMoeda(Moeda moeda) { //Função para adicionar moeda
		this.listaMoedas.add(moeda);
	};
	
	public void removerMoeda(int indice) { //Função para remover moedas baseada no indíce delas
		if (indice >= 0 && indice < listaMoedas.size()) {
			this.listaMoedas.remove(indice);
			System.out.println("Moeda removida com sucesso");
		} else {
			System.out.println("Índice inválido. Tente novamente");
		}
	};
	
	public void listarMoedas() { //Função de listar moedas
		if (listaMoedas.isEmpty()){
			System.out.println("Poxa, você não tem nenhuma moeda :(");
		}
		int index = 0;
		for (Moeda moedas : listaMoedas) {
			System.out.println(index + " - " + moedas.info());
			index++;
		}
	};

	
	public void totalConvertido() { //Função de converter
		double total = 0.0;
		
		for (Moeda moeda: listaMoedas) {
			total += moeda.converter(moeda.valor);
		}
		System.out.println("Total convertido: " + String.format("R$ %.2f", total));
	};
}
