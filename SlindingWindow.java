import java.util.Scanner;

public class SlindingWindow {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int k=3,sum=0,msum=0,start=0;
      for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        if(i>=k-1){
          msum=sum>msum?sum:msum;
          sum=sum-arr[start];
          start++;
        }
      }
    System.out.print(msum);
  }
}