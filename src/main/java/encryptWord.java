//5. Encrypt word when A=E
//        Input: Apple
//        Output: Fuuqj

import java.util.*;

class encryptWord {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = scanner.next();
        char[] chars = str.toCharArray();
        for (char word : chars) {
        word+=5;
            System.out.print(word);

        }

    }
}






