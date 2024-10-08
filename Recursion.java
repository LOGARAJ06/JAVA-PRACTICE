import java.util.Scanner;

public class Recursion{
  public static void main(String args[]){
    nanum(1);
  }

  public static void nanum(int n){
    if(n==10){
      System.out.print(10);
    }else{
      System.out.println(n);
      nanum(n+1);
    }
  }
}