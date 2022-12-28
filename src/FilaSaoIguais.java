public class FilaSaoIguais {
    public static void main(String[] args) {
        Fila<Integer> fila1 = new Fila<>(5);
        Fila<Integer> fila2 = new Fila<>(5);
        fila1.incluir(1);
        fila1.incluir(2);
        fila1.incluir(3);
        fila1.incluir(4);
        fila2.incluir(1);
        fila2.incluir(2);
        fila2.incluir(3);
        fila2.incluir(4);
        fila2.incluir(5);
        System.out.println(fila1.saoIguais(fila1, fila2));
    }
}
