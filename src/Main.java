import java.util.Random;
import java.util.Scanner;

/*
    Создать массив из слов String[] words = {}
    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
    Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
*/

public class Main {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        String str = new String();
        int minLength = 0;
        int randomNumber = random.nextInt(words.length);
        System.out.println(words[randomNumber]);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the string: ");
            str = sc.nextLine();

            if (str.length() >= words[randomNumber].length()) {
                minLength = words[randomNumber].length();
            }  else {
                minLength = str.length();
            }

            if (str.intern() == words[randomNumber].intern()) {
                System.out.println("You guessed the word - congratulations");
                break;
            } else {
                for (int i = 0; i < minLength; i++) {
                    if (str.charAt(i) == words[randomNumber].charAt(i)) {
                        System.out.print(str.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                for (int i = 0; i < 15 - minLength; i++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}
