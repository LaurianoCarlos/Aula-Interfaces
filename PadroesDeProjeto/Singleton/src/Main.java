import singleton.Cenario;
import singleton.LazySingleton;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Cenario s1 = Cenario.getCenario();
        s1.configuracoes();

        LazySingleton instance1 = LazySingleton.getLazySingleton();
        LazySingleton instance2 = LazySingleton.getLazySingleton();
        LazySingleton instance3 = LazySingleton.getLazySingleton();
        LazySingleton instance4 = LazySingleton.getLazySingleton();
        LazySingleton instance5 = LazySingleton.getLazySingleton();


        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
        System.out.println(instance5);
    }
}