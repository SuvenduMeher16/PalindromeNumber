import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, rem, rev = 0;
        System.out.println("Enter any Number :: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int temp = n;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (n == rev) {
            System.out.println(n + " is a Palindrome Number.");
        } else {
            System.out.println(n + " is not a Palindrome Number.");
        }
    }
}
