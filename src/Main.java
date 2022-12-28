import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ChecarEscopo escopo = new ChecarEscopo();
        String expressaoCerta = "A + [B ∗ (C + D)] ∗ E";
        String expressaoErrada = "A + B ∗ (C + D] ∗ E";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você quer testar qual Expressão? ");
        System.out.println("1 - " + expressaoCerta);
        System.out.println("2 - " + expressaoErrada);
        System.out.println("Digite sua alternativa: ");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            escopo.checkExpressao(expressaoCerta);
        } else if (opcao == 2) {
            escopo.checkExpressao(expressaoErrada);
        } else {
            System.out.println("Opção inválida!");
        }

    }
}
