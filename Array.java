import java.util.Scanner;

public class Array{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max=Integer.MIN_VALUE,max2=0;
    int n = sc.nextInt();
    int[] num = new int[n];
    for(int i=0;i<num.length;i++){
      num[i] = sc.nextInt();
      if(num[i]>max){
        max2=max;
        max=num[i];
      }
    }
    System.out.print(max);
  }
}