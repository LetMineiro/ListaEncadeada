package encadeada;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Menu ---");
			System.out.println("1. Inserir no início");
			System.out.println("2. Inserir no final");
			System.out.println("3. Inserir em uma posição específica");
			System.out.println("4. Remover do início");
			System.out.println("5. Remover do final");
			System.out.println("6. Remover de uma posição específica");
			System.out.println("7. Pesquisar valor");
			System.out.println("8. Atualizar valor em uma posição específica");
			System.out.println("9. Exibir lista");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite o valor: ");
				int valorInicio = scanner.nextInt();
				lista.inserirInicio(valorInicio);
				break;
			case 2:
				System.out.print("Digite o valor: ");
				int valorFinal = scanner.nextInt();
				lista.inserirFinal(valorFinal);
				break;
			case 3:
				System.out.print("Digite o valor: ");
				int valorPosicao = scanner.nextInt();
				System.out.print("Digite a posição: ");
				int posicaoInserir = scanner.nextInt();
				lista.inserirPosicao(valorPosicao, posicaoInserir);
				break;
			case 4:
				lista.removerInicio();
				break;
			case 5:
				lista.removerFinal();
				break;
			case 6:
				System.out.print("Digite a posição: ");
				int posicaoRemover = scanner.nextInt();
				lista.removerPosicao(posicaoRemover);
				break;
			case 7:
				System.out.print("Digite o valor: ");
				int valorPesquisar = scanner.nextInt();
				int posicaoEncontrada = lista.pesquisar(valorPesquisar);
				if (posicaoEncontrada != -1) {
					System.out.println("Valor encontrado na posição: " + posicaoEncontrada);
				} else {
					System.out.println("Valor não encontrado!");
				}
				break;
			case 8:
				System.out.print("Digite a posição: ");
				int posicaoAtualizar = scanner.nextInt();
				System.out.print("Digite o novo valor: ");
				int novoValor = scanner.nextInt();
				lista.atualizar(posicaoAtualizar, novoValor);
				break;
			case 9:
				lista.exibir();
				break;
			case 0:
				System.out.println("Saindo...");
				scanner.close();
				return;
			default:
				System.out.println("Opção inválida!");
			}
		}
	}

}
