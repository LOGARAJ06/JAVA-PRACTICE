import java.util.*;

public class Top {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline
        int max = 0;
        String player = "";
        
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            String p[] = s.split(",");
            int score = Integer.parseInt(p[1]);
            
            if (score > max) {
                max = score;
                player = p[0];
            }
        }
        
        System.out.println(player);
    }	    
}
