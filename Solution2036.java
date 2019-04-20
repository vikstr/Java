import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int n = 0;
        int k = 0;
        char[] letters = {'e', 'i', 'a', 'y', 'o', 'u'};
        String[] words;
        int[] new_words;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        words = new String[n];
        new_words = new int[n];
        Arrays.fill(new_words, 0);
        String word;
        for (int i = 0; i < n; i++) {
            words[i] = scan.next();
            word = words[i];
            int j = 0;
            k = 0;
            char c = word.charAt(0);
            while (j < word.length()) {
                if (c == letters[0] || c == letters[1] || c == letters[2] || c == letters[3] || c == 'o' || c == 'u') {
                    k++;
                } else {
                    k = 0;
                }
                if (k == 3) {
                    new_words[i] = -1;
                    break;
                }
                j++;
                if (j != word.length()) {
                    c = word.charAt(j);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (new_words[i] == 0) {
                System.out.println(words[i]);
            }
        }
    }
}
