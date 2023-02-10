//4. Count Vowels and consonants from a word
//        Input: Dhaka
//        Output:
//        Vowel: 2
//        Consonant: 3
import java.util.Scanner;
public class countVowelsAndConsonentsFromWord {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = scanner.next();
        int vowelCount = 0, consonantCount = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                vowelCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {

                consonantCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
