public class elemento<T>{
    private T valor;
    private elemento direita;
    private elemento esquerda;

    public elemento(T newValor) {
        this.valor = newValor;
        this.esquerda = null;
        this.direita = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public elemento getDireita() {
        return direita;
    }

    public void setDireita(elemento direita) {
        this.direita = direita;
    }

    public elemento getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(elemento esquerda) {
        this.esquerda = esquerda;
    }
}
