package criarcarrosautonomos;

public class Tesla implements CarroEletricoAutonomo {


    private int carga;
    private String psrtida;
    private String destino;
    private boolean modoAutonomo;


    public Tesla() {

    }

    public Tesla(int carga, String psrtida, String destino, boolean modoAutonomo) {
        this.carga = carga;
        this.psrtida = psrtida;
        this.destino = destino;
        this.modoAutonomo = modoAutonomo;
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando...");
    }

    @Override
    public void monitorarBateria() {
        System.out.println("Bateria Status: 80%");
    }

    @Override
    public void definirRota(String partida, String destino) {
        System.out.println("Partida: " + destino + "\nDestino: " + destino);
    }

    @Override
    public void ligarModoAutonomo() {
        this.modoAutonomo = true;
        System.out.println("Modo Autonomo Ligado");
    }

    @Override
    public void desligarModoAutonomo() {
        this.modoAutonomo = false;
        System.out.println("Modo Autonomo Desligado");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "carga=" + carga +
                ", psrtida='" + psrtida + '\'' +
                ", destino='" + destino + '\'' +
                ", modoAutonomo=" + modoAutonomo +
                '}';
    }
}
