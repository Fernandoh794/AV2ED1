public class ChecarEscopo {

    private Pilha pilha;

    public ChecarEscopo() {
        pilha = new Pilha(100);
    }

    public void checkExpressao(String expressao) {
        for (int i = 0; i < expressao.length(); i++) {
            char elemento = expressao.charAt(i);
            if (elemento == '(' || elemento == '[' || elemento == '{') {
                pilha.adicionar(elemento);
            } else if (elemento == ')' || elemento == ']' || elemento == '}') {
                if (pilha.estaVazia()) {
                    System.out.println("Expressão errada! Faltou um " + elemento);
                    return;
                }
                char topo = pilha.topo();
                if (elemento == ')' && topo == '(') {
                    pilha.remover();
                } else if (elemento == ']' && topo == '[') {
                    pilha.remover();
                } else if (elemento == '}' && topo == '{') {
                    pilha.remover();
                } else {
                    System.out.println("Expressão errada!  Faltou um " + elemento);
                    return;
                }
            }
        }
        if (pilha.estaVazia()) {
            System.out.println("Expressão correta!");
        } else {
            System.out.println("Expressão errada!");
        }
    }


}
