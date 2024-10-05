import java.util.Scanner;

public class leetcode{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int student = sc.nextInt();
    int parents = sc.nextInt();
    int sum = parents+student;
    if(sum>7000){
      if(student>=5000 && parents>=5000){
        if(student>2*parents){
          System.out.print("Great");
        }else{
          System.out.print("Outstanding");
        }
      }else{
        System.out.print("Good");
      }
    }else{
      System.out.print("Bad");
    }
  }
}
     
  






