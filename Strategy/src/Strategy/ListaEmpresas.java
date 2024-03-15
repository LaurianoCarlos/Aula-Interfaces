package Strategy;

import modelo.Carga;

public enum ListaEmpresas implements CalculoFrete{

   //Classes internas, com isso poderia apagar as outras classes
    ABC {
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
   },

    CBA {
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
    },
    XPTO {
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
    };
}
