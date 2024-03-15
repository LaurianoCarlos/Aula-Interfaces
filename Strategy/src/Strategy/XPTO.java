package Strategy;

import modelo.Carga;

public class XPTO implements CalculoFrete{
    @Override
    public double calcularFrete(Carga carga) {
        if (carga.getPeso() <= 10) {
            return 22.30;
        } else if (carga.getPeso() <= 20) {
            return 24.59;
        } else {
            return 30.71;
        }
    }
}
