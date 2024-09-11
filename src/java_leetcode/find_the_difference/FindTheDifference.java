package java_leetcode.find_the_difference;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int xor = 0;

        for (int i = 0; i < s.length(); i++) {
            xor = xor ^ s.charAt(i);
            System.out.println("xor: " + xor);
        }

        for (int i = 0; i < t.length(); i++) {
            xor^=t.charAt(i);
            System.out.println("xor: " + xor);
        }

        return (char)xor;
    }
}
