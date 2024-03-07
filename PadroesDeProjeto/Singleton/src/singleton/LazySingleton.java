package singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;
    private static final int MAX_INSTANCE = 3;
    private static int instanceCount = 0;

   private LazySingleton() {

    }

    public static LazySingleton getLazySingleton() {
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
            instanceCount++;
            return lazySingleton;
        } else if (instanceCount < MAX_INSTANCE){
            instanceCount++;
            return lazySingleton;
        }
        return null;
    }
}
