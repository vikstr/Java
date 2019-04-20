import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int a = 0;
        int b = 10009;
        int n = 0;
        int j = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            a = scan.nextInt();
            if (a < b) {
                b = a;
                j = i + 1;
            }
        }
        System.out.println(j);
    }
}
