package fabrica;

public class FabricaFiat implements Fabrica {
    @Override
    public Carro metodoFabrica(Enum carro) {
        if(carro.equals(ListaCarrosFiat.ARGO) ){
            return new Fox(12000, "KYZ");
        } else if (carro.equals(ListaCarrosFiat.CRONOS)) {
            return new Jetta(25000, "TSL");
        } else {
            return null;
        }
    }
}
