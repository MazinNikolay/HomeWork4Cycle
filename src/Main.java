public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();
        task8();
        System.out.println();
        task9();
        System.out.println();
        task10();
    }

    public static void task1() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void task4() {
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task5() {
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.print(i + " ");
        }
    }

    public static void task6() {
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
    }

    public static void task7() {
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
    }

    public static void task8() {
        int depositTotal = 0;
        int deposit = 29_000;
        for (int i = 1; i <= 12; i++) {
            depositTotal += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + depositTotal + " рублей");
        }
    }

    public static void task9() {
        double depositTotal = 0;
        int deposit = 29_000;
        for (int i = 1; i <= 12; i++) {
            depositTotal += deposit + (deposit * 0.01);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + depositTotal + " рублей");
        }
    }

    public static void task10() {
        int num = 2;
        for (int i = 1; i <= 10; i++, num = 2 * i) {
            System.out.println("2*" + i + "=" + num);
        }
    }
}