import java.util.Scanner;

/*
    Создать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ.
    Необходимо вычислить, сколько раз символ встречается в переданной строке и вернуть это числовое значение.
*/

public class FindSymbolOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter one character: ");
        char ch = sc.next().charAt(0);

        System.out.println(findSymbolOccurance(str, ch));
    }

    public static int findSymbolOccurance(String str, char ch) {
        char[] charArray = str.toCharArray();
        int result = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ch) {
                result++;
            }
        }

        return result;
    }
}
