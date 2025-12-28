
class newThread extends Thread{
  public void run(){
    System.out.println("newThread Running");
  }
}

public class Threads{
  public static void main(String[] args){
    System.out.println("Main Thread");

    newThread t1 = new newThread();
    t1.start();
  }
}