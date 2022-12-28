public interface IFila<T> {
    public void incluir(T elemento);
    public T remover();
    public boolean estaVazia();
    public void limpar();
    public T visualizarProximo() throws FilaVaziaException;
}
