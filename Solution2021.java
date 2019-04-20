import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int[] arr;
        int b = 0;
        int c = 0;
        int n = 0;
        int j = 0;
        int k = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] > b) {
                b = arr[i];
                j = i;
            }
        }
        for (int i = j; i < n; i++) {
            if (arr[i] == b) {
                arr[i] = (int) Math.floor(arr[i] / 2);
            }
        }
        b = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > b) {
                b = arr[i];
                j = i;
            }
        }
        for (int i = j; i < n; i++) {
            if (arr[i] == b) {
                arr[i] = (int) Math.floor(arr[i] / 2);
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
