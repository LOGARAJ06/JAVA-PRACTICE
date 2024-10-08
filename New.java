import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();
        int[] nums =new int[n];
        for(int i=0;i<nums.length;i++){
          if(nums[i]<nums[i+1]){
            count++;
          }if(i<nums.length){
            i=i;
          }
          System.out.print(count);
        }
        for(int i=0;i<nums.length-1;i++){
          if (nums[i]==nums[i+1] && i<nums.length){
            System.out.print(1);
          }
      }
        // for(int i=0;i<nums.length;i++){
        //   if(nums[i]<nums[i+1]){
        //     count++;
        //   }
        //   System.out.print(count);
        // }
      //System.out.print(count);
  }
}