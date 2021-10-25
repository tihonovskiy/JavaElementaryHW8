import java.util.Scanner;

/*
    Создать метод isPalindrome. Метод принимает в качестве параметра строку.
    Необходимо Проверить является ли переданная строка палиндромом.
    Если да, тогда вернут true, иначе false.
*/

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String palindromeStr = sc.nextLine();

        System.out.println("isPalindrome = " + isPalindrome(palindromeStr));
        System.out.println("isPalindromeStringBuilder = " + isPalindromeStringBuilder(palindromeStr));
    }

    public static boolean isPalindrome(String str) {
        String string = str.toLowerCase().replaceAll("\\s+","");
        int i = 0;
        int j = string.length() - 1;

        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindromeStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        String reverseStr = String.valueOf(stringBuilder.reverse());
        if(str.toLowerCase().replaceAll("\\s+","").intern() == reverseStr.toLowerCase().replaceAll("\\s+","").intern()) {
            return true;
        }
        return false;
    }
}
