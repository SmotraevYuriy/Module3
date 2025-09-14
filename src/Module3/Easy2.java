package Module3;

import java.util.Scanner;

public class Easy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();
        System.out.println("Введите третье число:");
        double c = scanner.nextDouble();
        double d = a + b + c;
        double e = a * b * c;
        System.out.println("Произведение чисел равно " + e + " Сумма чисел равна " + d);
    }
}
