import java.util.Scanner;

public class Sp{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float cost = sc.nextInt();
    float loss = sc.nextInt();
    System.out.printf("sp:"+" "+"%.2f",cost-(cost*loss/100));
  }
}