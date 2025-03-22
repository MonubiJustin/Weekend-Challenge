import java.util.Scanner;
import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any word to check if its an istogram: ");
        String word = scanner.nextLine().trim().toLowerCase();

        System.out.println(isIsogram(word));

        scanner.close();
    }

    // public method to check if a word is an isogram
    public static boolean isIsogram(String word) {

        HashSet<Character> seen = new HashSet<>();
        for (char ch : word.toCharArray()) {
            if (seen.contains(ch))
                return false;
            seen.add(ch);
        }
        return true;
    }
}
