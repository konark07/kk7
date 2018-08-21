public class Palindrome {

    public static void main(String[] args) {

        int num = 121, reversedInteger = 0, remainder, original;

        original = num;
 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  =num/ 10;
        }
        if (original== reversedInteger)
            System.out.println(original+ " is a palindrome.");
        else
            System.out.println(original+ " is not a palindrome.");
    }
}