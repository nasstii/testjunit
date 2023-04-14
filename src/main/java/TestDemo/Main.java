import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        int count = StringUtils.countOccurrences(str1, str2);
        System.out.println("Количество вхождений: " + count);
    }
}