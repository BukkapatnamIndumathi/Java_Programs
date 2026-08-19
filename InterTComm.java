package Threads.Basics;

class PoducerConPro{
    boolean ready=false;
    synchronized void WaitingForMessage() throws InterruptedException{
        while (!ready){
            wait();
        }
        System.out.println("message received");
    }
    synchronized void SendTheMessage(){
        ready=true;
        System.out.println("messagee sent");
        notify();

    }
}
public class InterTComm {
    public static void main(String[] args){
        PoducerConPro pcp=new PoducerConPro();
        Thread sende=new Thread(() ->{
            pcp.SendTheMessage();
        });
        Thread receive=new Thread(()->{
            try {
                pcp.WaitingForMessage();
                System.out.println("I1");
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        Thread receive1=new Thread(()->{
            try {
                pcp.WaitingForMessage();
                System.out.println("I2");
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        sende.start();
        receive.start();
        receive1.start();

    }
}
