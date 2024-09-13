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

    public static class FindTheDifference2 {
        public char findTheDifference2(String s, String t) {
            int ss = 0;
            int tt = 0;

            for (int i = 0; i < s.length(); i++) {
                ss += (int)s.charAt(i);
                System.out.println("ss: " +  ss);
            }

            for (int i = 0; i < t.length(); i++) {
                tt += (int)t.charAt(i);
                System.out.println("tt: " +  tt);
            }

            System.out.println("result: " + (tt-ss));
            System.out.println("ASCII value of Y is: " +  (int)'y');
            return (char)(tt-ss);
        }
    }
}
