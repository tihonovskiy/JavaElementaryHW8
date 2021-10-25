import java.util.Scanner;

/*
    Создать метод stringReverse. Метод принимает в качестве параметра строку.
    Необходимо ее развернуть и вернуть измененный вариант.
*/

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String reverseStr = sc.nextLine();

        System.out.println("stringReverse = " + stringReverse(reverseStr));
        System.out.println("stringReverseStringBuilder = " + stringReverseStringBuilder(reverseStr));
    }

    public static String stringReverse(String str) {
        String result = "";
        char[] charArray = str.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            result += charArray[i];
        }

        return result;
    }

    public static String stringReverseStringBuilder(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return String.valueOf(stringBuilder.reverse());
    }
}
