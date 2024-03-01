import criarcarrosautonomos.Tesla;

public class Main {
    public static void main(String[] args) {

        Tesla tesla = new Tesla(90, "Senac Santo Amaro", "Casa Quentinha", true);

        System.out.println(tesla);

        tesla.monitorarBateria();
    }
}