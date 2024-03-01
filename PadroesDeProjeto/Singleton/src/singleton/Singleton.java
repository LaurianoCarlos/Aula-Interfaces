package singleton;

public  class Singleton {
    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getInstance(){return singleton;}
}
