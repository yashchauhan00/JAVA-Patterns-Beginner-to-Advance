
//Left half pyramid
//      *
//     **
//    ***
//   ****
//  *****
import java.util.*;

public class Pattern5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the numbers=");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int K = 1; K <= i; K++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
