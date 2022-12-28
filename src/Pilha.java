public class Pilha {
    private int topo;
    private char[] pilha;
    private int tamanho;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new char[tamanho];
        this.topo = -1;
    }

    public void adicionar(char elemento) {
        if (topo == tamanho - 1) {
            System.out.println("Pilha cheia");
        } else {
            topo++;
            pilha[topo] = elemento;
        }
    }

    public char remover() {
        if (topo == -1) {
            System.out.println("Pilha vazia");
            return ' ';
        } else {
            char elemento = pilha[topo];
            topo--;
            return elemento;
        }
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public char topo() {
        return pilha[topo];
    }
}
