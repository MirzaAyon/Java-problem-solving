//3.  Find out sum of digits of a number
//        Input: 152
//        Output: 8

import java.util.Scanner;
public class sumOfDigits
{
    public static void main(String args[])
    {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while(number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
