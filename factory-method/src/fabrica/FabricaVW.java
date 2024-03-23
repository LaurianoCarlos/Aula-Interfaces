package fabrica;

public class FabricaVW implements Fabrica {
    public  Carro metodoFabrica(Enum carro){
      if(carro.equals(ListaCarrosVW.FOX) ){
          return new Fox(123000, "Urban");
      } else if (carro.equals(ListaCarrosVW.JETTA)) {
          return new Jetta(35000, "Jetta");
      } else {
         return null;
      }
    }
}

























