import java.util.Scanner;

public class hello{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    int x3 = sc.nextInt();
    int y3 = sc.nextInt();
    System.out.print("centroid:"+" "+((x1+x2+x3)/3)+","+1 ((y1+y2+y3)/3));
  }
}