
// Reverse Right Half Pyramid
//     *****
//     ****
//     ***
//     **
//     *
import java.util.*;

public class Pattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the numbers=");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
