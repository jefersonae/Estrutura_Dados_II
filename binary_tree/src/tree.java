public class tree <T extends Comparable>{
    private elemento<T> root;

    public tree() {
        this.root = root;
    }

    public void add(T valor){
        elemento<T> newElemento = new elemento<>(valor);
        if (root == null){
            this.root = newElemento;
        }else {
            elemento<T> current = this.root;
            while (true){
                if (newElemento.getValor().compareTo(current.getValor()) == -1){
                    if (current.getEsquerda() != null){
                        current = current.getEsquerda();
                    }else {
                        current.setEsquerda(newElemento);
                        break;
                    }
                }else {
                    if (current.getDireita() != null){
                        current = current.getDireita();
                    }else {
                        current.setDireita(newElemento);
                        break;
                    }
                }
            }
        }
    }

    // Adicionando em pré ordem
    public void beforeOrder(elemento<T> current){
        if (current != null){
            System.out.println(current.getValor());
            beforeOrder(current.getEsquerda());
            beforeOrder(current.getDireita());
        }
    }

    // Adicionando em ordem
    public void inOrder(elemento<T> current){
        if (current != null){
            inOrder(current.getEsquerda());
            System.out.println(current.getValor());
            inOrder(current.getDireita());
        }
    }

    // Adicionando em pós ordem
    public void afterOrder(elemento<T> current){
        afterOrder(current.getEsquerda());
        afterOrder(current.getDireita());
        System.out.println(current.getValor());
    }

    public elemento<T> getRoot() {
        return root;
    }

    public void setRoot(elemento<T> root) {
        this.root = root;
    }
}