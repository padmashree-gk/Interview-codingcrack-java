package strings;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {
        String str1 = "god";
        String str2 = "godd";

        if (str1.length() == str2.length()) {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean isAnagram = true;

            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("It is not an anagram");
            }
        } else {
            System.out.println("Enter a valid String");
        }
    }
}
