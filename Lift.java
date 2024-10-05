import java.util.Scanner;

public class Lift{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int N1 = sc.nextInt();//4   10-4=6
    int N2 = sc.nextInt();//8   10-8=2
    int N3 = sc.nextInt();//12  10-12=-2
    int d1 = Math.abs(N-N1);
    int d2 = Math.abs(N-N2);
    int d3 = Math.abs(N-N3);
    if(d1<d2 && d1<d3){
      System.out.print(N1);
    }else if(d2<d1 && d2<d3){
      System.out.print(N2);
    }else{
      System.out.print(N3);
    }
  }
}