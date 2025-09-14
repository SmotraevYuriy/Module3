package Module3;

import java.util.Scanner;

public class Medium1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        int a = scanner.nextInt();
        System.out.println("Введите зарплату за день:");
        double b = scanner.nextDouble();
        double c = a * b;
        System.out.println("Зарплата за месяц - " + c);

    }
}
