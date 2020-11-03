public class Fila {

    private No primeiro;
    private No ultimo;

    public Fila() {
        primeiro = new No();
        ultimo = primeiro;
    }

    public boolean filaVazia(){
        return ((primeiro == null) && (ultimo == null));
    }

    public void enfileirar(int elementoUsuario) {
        ultimo.proximo = new No(elementoUsuario);
        ultimo = ultimo.proximo;
    }

    public int desenfileirar() throws Exception {
        if (filaVazia()) {
            throw new Exception("Não é possível remover, a fila está vazia!");
        }

        No temporario = primeiro;
        primeiro = primeiro.proximo;
        int resp = primeiro.elemento;
        temporario.proximo = null;
        temporario = null;

        return resp;
    }

    public void imprimir() {
        for(No i = primeiro.proximo; i != null; i = i.proximo) {
            System.out.print("[" + i.elemento + "] ");
        }
        System.out.println();
    }
}
