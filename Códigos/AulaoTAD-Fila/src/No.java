public class No {

    public No proximo;
    public int elemento;

    public No() {
        this(0);
    }

    public No(int entradaUsuario) {
        elemento = entradaUsuario;
        proximo = null;
    }
}
