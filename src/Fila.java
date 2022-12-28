public class Fila<T> {

    private Object[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = 0;
    }

    public void incluir(Object elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.fim] = elemento;
            this.fim = (this.fim + 1) % this.elementos.length;
            this.tamanho++;
        }
    }

    public Object remover() {
        Object elemento = null;
        if (this.tamanho > 0) {
            elemento = this.elementos[this.inicio];
            this.inicio = (this.inicio + 1) % this.elementos.length;
            this.tamanho--;
        }
        return elemento;
    }

    public boolean saoIguais(Fila<T> fila1, Fila<T> fila2) {
        if (fila1.tamanho != fila2.tamanho) {
            return false;
        }
        int i = fila1.inicio;
        int j = fila2.inicio;
        for (int k = 0; k < fila1.tamanho; k++) {
            if (!fila1.elementos[i].equals(fila2.elementos[j])) {
                return false;
            }
            i = (i + 1) % fila1.elementos.length;
            j = (j + 1) % fila2.elementos.length;
        }
        return true;
    }

}
