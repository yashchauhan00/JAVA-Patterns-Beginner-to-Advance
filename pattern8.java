
//Number Changing Pyramid
// 1
// 2 3
// 4 5 6
// 7 8 9 10
import java.util.*;

public class pattern8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int number = 1;
        System.out.print("Enter the number=");
        n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(+number);
                number++;
            }
            System.out.println();
        }
    }
}
