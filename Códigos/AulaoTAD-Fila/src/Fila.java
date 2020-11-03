public class Fila {

    private No primeiro;
    private No ultimo;

    public Fila() {
        primeiro = new No();
        ultimo = primeiro;
    }

    public boolean filaVazia(){
        return (primeiro == null && ultimo == null);
    }

}
