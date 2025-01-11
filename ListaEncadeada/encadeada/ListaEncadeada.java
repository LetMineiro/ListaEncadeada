package encadeada;

class ListaEncadeada {
	private No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    // Inserção no início
    public void inserirInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    // Inserção no final
    public void inserirFinal(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    // Inserção em uma posição específica
    public void inserirPosicao(int valor, int posicao) {
        if (posicao < 0) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 0) {
            inserirInicio(valor);
            return;
        }

        No novoNo = new No(valor);
        No atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            if (atual == null) {
                System.out.println("Posição inválida!");
                return;
            }
            atual = atual.proximo;
        }

        if (atual != null) {
            novoNo.proximo = atual.proximo;
            atual.proximo = novoNo;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    // Remoção do início
    public void removerInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        inicio = inicio.proximo;
    }

    // Remoção do final
    public void removerFinal() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (inicio.proximo == null) {
            inicio = null;
            return;
        }

        No atual = inicio;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = null;
    }

    // Remoção em uma posição específica
    public void removerPosicao(int posicao) {
        if (posicao < 0 || inicio == null) {
            System.out.println("Posição inválida ou lista vazia!");
            return;
        }

        if (posicao == 0) {
            removerInicio();
            return;
        }

        No atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            if (atual == null || atual.proximo == null) {
                System.out.println("Posição inválida!");
                return;
            }
            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    // Pesquisa de um valor
    public int pesquisar(int valor) {
        No atual = inicio;
        int posicao = 0;
        while (atual != null) {
            if (atual.valor == valor) {
                return posicao;
            }
            atual = atual.proximo;
            posicao++;
        }
        return -1;
    }

    // Atualização de valor em uma posição específica
    public void atualizar(int posicao, int novoValor) {
        if (posicao < 0) {
            System.out.println("Posição inválida!");
            return;
        }

        No atual = inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual == null) {
                System.out.println("Posição inválida!");
                return;
            }
            atual = atual.proximo;
        }

        if (atual != null) {
            atual.valor = novoValor;
        } else {
            System.out.println("Posição inválida!");
        }
    }

    // Exibição da lista
    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}