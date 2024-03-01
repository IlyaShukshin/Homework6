public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача №2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Задача №3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задача №4");
        for (int i = -10; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача №5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println("Задача №6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача №7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача №8");
        int cash = 29000;
        int sum = 0;
        for (int month = 1; month <= 12; month++) {
            sum = sum + cash;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum);
        }
        System.out.println("Задача №9");
        cash = 29000;
        sum = 0;
        int percent = sum / 100 * 12;
        for (int month = 1; month <= 12; month++) {
            percent = sum + sum / 100 * 12;
            sum = percent + cash;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum);
        }
        System.out.println("Задача №10");
        int a = 2;
        int b = 0;
        for (int i = 1; i <= 9; i++) {
            b = a * i;
            System.out.println(a + " * " + i + " = " + b);
        }
    }
}