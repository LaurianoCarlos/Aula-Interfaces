package app;

import fabrica.Carro;
import fabrica.Fabrica;
import fabrica.FabricaVW;
import fabrica.ListaCarrosVW;

public class Cliente {
    public static void main(String[] args){


      Fabrica carro = new FabricaVW();

      carro.metodoFabrica(ListaCarrosVW.JETTA);

        System.out.println(carro);
    }
}
