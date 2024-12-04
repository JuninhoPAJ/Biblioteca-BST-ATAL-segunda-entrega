public class ArvoreBinariaDeBusca {
    private NoArvore raiz;

    public ArvoreBinariaDeBusca() {
        this.raiz = null;
    }

    // Adicionar um livro à árvore
    public void adicionarLivro(Livro livro) {
        raiz = adicionarRecursivo(raiz, livro);
    }

    private NoArvore adicionarRecursivo(NoArvore atual, Livro livro) {
        if (atual == null) {
            return new NoArvore(livro);
        }

        if (livro.titulo.compareToIgnoreCase(atual.livro.titulo) < 0) {
            atual.esquerda = adicionarRecursivo(atual.esquerda, livro);
        } else if (livro.titulo.compareToIgnoreCase(atual.livro.titulo) > 0) {
            atual.direita = adicionarRecursivo(atual.direita, livro);
        }

        return atual;
    }

    // Listar livros em ordem alfabética
    public void listarLivros() {
        System.out.println("=== Lista de Livros (Ordem Alfabética) ===");
        listarLivrosEmOrdem(raiz);
    }

    private void listarLivrosEmOrdem(NoArvore atual) {
        if (atual != null) {
            listarLivrosEmOrdem(atual.esquerda);
            System.out.println(atual.livro);
            listarLivrosEmOrdem(atual.direita);
        }
    }

    // Listar livros por autor
    public void listarLivrosPorAutor(String autor) {
        System.out.println("=== Livros do Autor: " + autor + " ===");
        listarPorAutorRecursivo(raiz, autor);
    }

    private void listarPorAutorRecursivo(NoArvore atual, String autor) {
        if (atual != null) {
            listarPorAutorRecursivo(atual.esquerda, autor);
            if (atual.livro.autor.equalsIgnoreCase(autor)) {
                System.out.println(atual.livro);
            }
            listarPorAutorRecursivo(atual.direita, autor);
        }
    }

    // Listar livros por ano
    public void listarLivrosPorAno(int ano) {
        System.out.println("=== Livros Publicados no Ano: " + ano + " ===");
        listarPorAnoRecursivo(raiz, ano);
    }

    private void listarPorAnoRecursivo(NoArvore atual, int ano) {
        if (atual != null) {
            listarPorAnoRecursivo(atual.esquerda, ano);
            if (atual.livro.ano == ano) {
                System.out.println(atual.livro);
            }
            listarPorAnoRecursivo(atual.direita, ano);
        }
    }

    // Recomendação de livros por intervalo de anos
    public void recomendarLivrosPorIntervalo(int anoInicio, int anoFim) {
        System.out.println("=== Livros Publicados entre " + anoInicio + " e " + anoFim + " ===");
        listarPorIntervaloRecursivo(raiz, anoInicio, anoFim);
    }

    private void listarPorIntervaloRecursivo(NoArvore atual, int anoInicio, int anoFim) {
        if (atual != null) {
            listarPorIntervaloRecursivo(atual.esquerda, anoInicio, anoFim);
            if (atual.livro.ano >= anoInicio && atual.livro.ano <= anoFim) {
                System.out.println(atual.livro);
            }
            listarPorIntervaloRecursivo(atual.direita, anoInicio, anoFim);
        }
    }
}
