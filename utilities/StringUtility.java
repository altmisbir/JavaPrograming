package utilities;

public class StringUtility {
    //print each character of the given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    // reverses the given string and returns the reversed string
    public static String reverse(String str) {// "Java"
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }

        return result; // "avaJ"
    }
}
