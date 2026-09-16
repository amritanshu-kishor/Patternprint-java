package practicepattern;
import java.util.*;
//Condition n is always odd
public class plussign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n%2==0){
            System.out.println("Enter odd no.");
        }
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == n / 2 + 1 || j == n / 2 + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
