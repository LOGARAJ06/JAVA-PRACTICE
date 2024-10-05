import java.util.Scanner;

public class Vehicle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N1 = sc.nextInt();
    int N2 = sc.nextInt();
    int N3 = sc.nextInt();
    int N4 = sc.nextInt();
    int N = sc.nextInt();
    if(N1>N){
      System.out.print("B1");
    }else if(N1+N2>N){
      System.out.print("B2");
    }else if(N1+N2+N3>N){
      System.out.print("B3");
    }else if(N1+N2+N3+N4>N){
      System.out.print("B4");
    }else{
      System.out.print("EXT");
    }
  }
}