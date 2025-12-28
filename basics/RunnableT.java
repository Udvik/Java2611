class myTask implements Runnable{
  public void run(){
    System.out.println("Thread from Runnable interface");
  }
}


public class RunnableT {
  public static void main(String[] args){
    System.out.println("Main Thread");
    Thread t1 = new Thread(new myTask());
    t1.start();
  }
}
