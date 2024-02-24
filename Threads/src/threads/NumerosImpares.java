package threads;

public class NumerosImpares extends Thread {

    @Override
    public void run(){
        for(int i = 1; i <= 101; i+=2){
            System.out.println(i);
        }
    }
}
