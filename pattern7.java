
//Number increasing Reverse Pyramid
// 12345
// 1234
// 123
// 12
// 1
import java.util.*;

public class pattern7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number=");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(+j);
            }
            System.out.println();
        }
    }
}