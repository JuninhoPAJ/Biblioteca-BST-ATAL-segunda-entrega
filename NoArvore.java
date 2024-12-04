public class NoArvore {
    Livro livro;
    NoArvore esquerda;
    NoArvore direita;

    public NoArvore(Livro livro) {
        this.livro = livro;
        this.esquerda = null;
        this.direita = null;
    }
}
