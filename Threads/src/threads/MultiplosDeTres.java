package threads;

public class MultiplosDeTres extends Thread {
    @Override
    public void run(){
        for(int i = 0; i <= 100; i+=3){
            System.out.println(i);
        }
    }
}
