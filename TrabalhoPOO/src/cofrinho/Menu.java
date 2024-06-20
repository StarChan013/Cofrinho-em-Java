package cofrinho;

import java.util.Scanner; //Importa a funça pro usuário digitar

public class Menu {
	
	Scanner Teclado = new Scanner(System.in); //Nomeia o Scanner como teclado
	
	Cofrinho meuCofrinho = new Cofrinho(); //Cria um Cofrinho novo da classe Cofrinho
	
	//Booleanos que iniciam como verdadeiro para controle de loop
	boolean menuPrincipal = true; 
	boolean continuar = true;
	
	public void menuPrincipal() {
		while (menuPrincipal) { //Enquanto o booleano Menu Principal for verdaidero, esse loop continua 
	        System.out.println("Bem-vindo ao seu Cofrinho!");
	        System.out.println("1 - Adicionar Moeda");
	        System.out.println("2 - Remover Moeda");
	        System.out.println("3 - Listar Moedas");
	        System.out.println("4 - Total convertido das Moedas");
	        System.out.println("0 - Sair");

	        int opMenuPrincipal = Teclado.nextInt();

	        switch (opMenuPrincipal) {
	            case 0: //Caso o usuário escolha sair
	            	System.out.println("Obrigada por utilizar o Cofrinho :D");
	            	//Booleanos ficam falsos e finalizam o loop
	            	menuPrincipal = false; 
	            	continuar = false;
                    break;
	            case 1:
	                boolean valorValido = true;
	                
	                double valorDepositar = 0; //Reserva na memória um valor a depositar

	                while (valorValido) {
	                    System.out.println("Digite o valor a ser depositado: ");
	                    valorDepositar = Teclado.nextDouble();

	                    if (valorDepositar <= 0) {
	                        System.out.println("Valor inválido");
	                        continue; //Continua o loop até o usuário atingir um valor que não caia no if
	                    } else {
	                        valorValido = false;
	                        break;
	                    }
	                }

	                boolean moedaValida = true;

	                while (moedaValida) {
	                    System.out.println("Digite o tipo da moeda");
	                    System.out.println("1 - REAL");
	                    System.out.println("2 - DOLAR");
	                    System.out.println("3 - EURO");

	                    int tipoMoeda = Teclado.nextInt();

	                    switch (tipoMoeda) { 
	                        case 1:
	                            Real valorDepositadoReal = new Real(valorDepositar);
	                            meuCofrinho.adicionarMoeda(valorDepositadoReal);
	                            System.out.println("Você depositou: " + valorDepositadoReal.info());
	                            //Booleanos de controle do loop. Ao colocar false, o moedaValida e menuPrincipal encerrar seu loop e o continuar é puxado
	                            moedaValida = false;
	                            menuPrincipal = false;
	                            continuar = true;
	                            break;
	                        case 2:
	                            Dolar valorDepositadoDolar = new Dolar(valorDepositar);
	                            meuCofrinho.adicionarMoeda(valorDepositadoDolar);
	                            System.out.println("Você depositou: " + valorDepositadoDolar.info());
	                            moedaValida = false;
	                            menuPrincipal = false;
	                            continuar = true;
	                            break;
	                        case 3:
	                            Euro valorDepositadoEuro = new Euro(valorDepositar);
	                            meuCofrinho.adicionarMoeda(valorDepositadoEuro);
	                            System.out.println("Você depositou: " + valorDepositadoEuro.info());
	                            moedaValida = false;
	                            menuPrincipal = false;
	                            continuar = true;
	                            break;
	                        default:
	                            System.out.println("Opção inválida");
	                            continue;
	                    }

	                }

	                break;
	            case 2:
	                System.out.println("Selecione qual moeda dessa remover considerando o número da sua posição");
	                meuCofrinho.listarMoedas();
	                
	                int moedaARemover = Teclado.nextInt();
	                meuCofrinho.removerMoeda(moedaARemover);
	                
	                menuPrincipal = false;
	                continuar = true;
	                break;
	            case 3:
	                System.out.println("Aqui está sua lista de moedas");
	                meuCofrinho.listarMoedas();
	                menuPrincipal = false;
	                continuar = true;
	                break;
	            case 4:
	            	System.out.println("Aqui está a soma valor convertido em R$ das moedas disponíveis no seu Cofrinho");
	            	meuCofrinho.totalConvertido();
	            	menuPrincipal = false;
	            	continuar = true;
	            	break;
	            default:
	                System.out.println("Opção inválida");
	                menuPrincipal = true;
	                continue;
	        }

            while (continuar) { //Loop para ver se o usuário vai continuar
                System.out.println("Deseja realizar outra operação?");
                System.out.println("1 - SIM");
                System.out.println("2 - NÃO");

                int opContinuar = Teclado.nextInt();

                switch (opContinuar) {
                    case 1:
                        continuar = false;
                        menuPrincipal = true;
                        continue;
                    case 2:
                    	System.out.println("Obrigada por utilizar o Cofrinho :D");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida");
                        continuar = true;
                        continue;
                }
            }
	        
	    }
	}
}

