package arena;

import roboTanque.CoresRGB;
import roboTanque.TanqueRobo;

public class Arena {
    public static void main(String[] args){

        TanqueRobo tanque = new TanqueRobo(0, 0, CoresRGB.GREEN, CoresRGB.RED, "fastTank");

        tanque.movNorte();
        tanque.movLeste();
        tanque.movLeste();
        System.out.println(tanque);

        try{
            tanque.atirar(6L);
        } catch (IllegalArgumentException e) {
            System.out.println("O valor deve estar entre 1 e 5: " + e.getMessage());
        }

    }
}
