
//Square fill Pattern 
// *****
// *****
// *****
// *****
import java.util.*;

public class Pattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the numbers=");
        n = sc.nextInt();
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}