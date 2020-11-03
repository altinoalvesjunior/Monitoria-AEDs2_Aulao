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

    public int desenfileirar() {

        if (filaVazia())
            System.out.println("Não é possível remover, a fila está vazia!");
        else
            primeiro = primeiro.proximo;

        // ---- Segunda Forma ----
        /*else {
            No temporario = primeiro;
            primeiro = primeiro.proximo;
            temporario.proximo = null;
            temporario = null;
        }*/
        // ---- Segunda Forma ----

        return primeiro.elemento;
    }

    public void imprimir() {
        for(No i = primeiro.proximo; i != null; i = i.proximo) {
            System.out.print("[" + i.elemento + "] ");
        }
        System.out.println();
    }
}
