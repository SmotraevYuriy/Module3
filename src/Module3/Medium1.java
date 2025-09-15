package Module3;

import java.util.Scanner;

public class Medium1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней:");
        int days = scanner.nextInt();
        System.out.println("Введите зарплату за день:");
        double salary = scanner.nextDouble();
        double c = days * salary;
        System.out.println("Зарплата за месяц - " + c);

    }
}
