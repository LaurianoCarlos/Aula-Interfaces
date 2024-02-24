package threads;

public class UsaThreads {
    public static void main(String[] args) {
        NumerosImpares numerosImpares = new NumerosImpares();
        NumerosPares numerosPares = new NumerosPares();
        MultiplosDeTres multiplosDeTres = new MultiplosDeTres();

        numerosPares.start();
        numerosImpares.start();
        multiplosDeTres.start();
    }
}