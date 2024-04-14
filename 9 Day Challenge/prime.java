import java.util.Scanner;

/**
 * prime
 */
public class prime {
    public static void main(String[] args) {
        int n, i, flag = 0;

        System.out.println("enter a positive integer : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        if (n == 0 || n == 1)
            flag = 1;

        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                flag = 1;
            break;
        }
        if (flag == 0)
            System.out.println(" prime number");
        else
            System.out.println("not prime");
    }

}