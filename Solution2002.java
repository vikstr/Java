import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int n = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            a = scan.nextInt();
            b += a;
        }
        System.out.println(b);
    }
}
