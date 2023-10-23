    //Number Triangular
//          1
//        2   2
//     3    3   3
// 4     4    4    4
import java.util.*;

public class Pattern12 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter the number=");
    n = sc.nextInt();
    for (int i = 1; i < n; i++) {
      for (int j = i; j < n - 1; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print(" " + i);
      }
      System.out.println();
    }
  }
}
