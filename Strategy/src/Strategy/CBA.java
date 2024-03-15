package Strategy;

import modelo.Carga;

public class CBA implements CalculoFrete{
    @Override
    public double calcularFrete(Carga carga) {
        if (carga.getPeso() <= 10) {
            return 09.30;
        } else if (carga.getPeso() <= 20) {
            return 07.59;
        } else {
            return 10.71;
        }
    }
}
