package Module3;

import java.util.Scanner;

public class Easy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение а");
        int a = scanner.nextInt();
        System.out.println("Введите значение b");
        int b = scanner.nextInt();
        int c = b;
        b = a;
        System.out.println("Значение а = " + c + " Значение b = " + b);
    }
}
