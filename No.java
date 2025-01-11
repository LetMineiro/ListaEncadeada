package encadeada;

public class No {
	int valor;
	No proximo;

	No(int valor) {
		this.valor = valor;
		this.proximo = null;
	}
}