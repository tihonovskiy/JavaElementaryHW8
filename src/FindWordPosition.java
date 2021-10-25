import java.util.Scanner;

/*
    Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target).
    Необходимо выяснить, является ли target (подстрока) частью строки source.
    Если да, тогда вернуть номер позиции (индекс) первого элемента подстроки в строке, иначе вернуть -1.
*/

public class FindWordPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source string: ");
        String source = sc.nextLine();
        System.out.print("Enter target string: ");
        String target = sc.nextLine();

        System.out.println(findWordPosition(source, target));
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }
}
