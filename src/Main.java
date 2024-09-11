import java_leetcode.FirstOccurrence.FirstOccurrence;
import java_leetcode.find_the_difference.FindTheDifference;
import java_leetcode.find_the_difference.FindTheDifference2;

public class Main {
    public static void main(String[] args) {
        FirstOccurrence firstOccurrence = new FirstOccurrence();
        FindTheDifference solution = new FindTheDifference();
        FindTheDifference2 solution2 = new FindTheDifference2();

        System.out.println("--------------------------------FindTheDifference--------------------------------");
        System.out.println(solution.findTheDifference("umutuygun", "tumunugyuy"));
        System.out.println("-----------------------");
        System.out.println(solution2.findTheDifference2("umutuygun", "tumunugyuy"));
        System.out.println("----------------------------------------------------------------");
        System.out.println(firstOccurrence.strStr("mississippi", "issip"));
    }
}