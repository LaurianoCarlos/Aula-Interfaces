package cliente;

import singleton.Singleton;

public class UsaSingleton extends Thread {

    public void run(){
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
    }
    public static void main(String[] args) {

        UsaSingleton t1 = new UsaSingleton();
        UsaSingleton t2 = new UsaSingleton();
        UsaSingleton t3 = new UsaSingleton();
        UsaSingleton t4 = new UsaSingleton();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
