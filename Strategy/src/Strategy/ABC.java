package Strategy;

import modelo.Carga;

public class ABC implements CalculoFrete {
    @Override
    public double calcularFrete(Carga carga) {
        if (carga.getPeso() <= 10) {
            return 11.30;
        } else if (carga.getPeso() <= 20) {
            return 13.59;
        } else {
            return 16.71;
        }
    }
}
