import java.util.Scanner;

class UserInput{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine(); //if we click enter then this will be used up
    String name = sc.next();
    System.out.println(num + "" +name);
  }
}