package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //homeworkExample1();
        //stringEquals();
        //logicalInfo1();
        //switchExample1();
        //switchExample2();
        //correctInput();
    }

    public static void homeworkExample1() {
        // Квадратное уравнение
        // ax^2 + bx + c = 0
        // D = b^2 - 4ac
        // x1,x2 = (-b +- sqrt(D)) / 2a
        double a;
        double b;
        double c;
        double D;
        double x1;
        double x2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Решение квадратного уравнения");
        System.out.println("ax^2 + bx + c = 0");

        System.out.print("Введите a = ");
        a = scanner.nextDouble();

        System.out.print("Введите b = ");
        b = scanner.nextDouble();

        System.out.print("Введите c = ");
        c = scanner.nextDouble();

        // Находим D
        D = b * b - 4 * a * c;
        System.out.println("D = b * b - 4 * a * c = " + D);

        // D > 0 - два корня
        // D == 0 - один корень
        // D < 0 - корней нет

        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Существует два корня, так как D > 0");
            System.out.println("x1 = (-b + Math.sqrt(D)) / (2 * a) = " + x1);
            System.out.println("x2 = (-b - Math.sqrt(D)) / (2 * a) = " + x2);
        } else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("Существует один корен, так как D == 0");
            System.out.println("x1 = -b / (2 * a) = " + x1);
        } else {
            System.out.println("Не существует корней, так как D < 0");
        }
    }

    public static void stringEquals() {
        // homeworkExample1();

        String userLogin = "user";
        String userPassword = "1234";

        String adminLogin = "admin";
        String adminPassword = "passwordShilov";

        String inputLogin;
        String inputPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин : ");
        inputLogin = scanner.next();
        System.out.print("Введите пароль : ");
        inputPassword = scanner.next();

        if (inputLogin.toLowerCase().equals(userLogin.toLowerCase()) &&
                inputPassword.equals(userPassword)) {
            System.out.println("Привет, Юзверь :)");
        } else if (inputLogin.toLowerCase().equals(adminLogin.toLowerCase()) &&
                inputPassword.equals(adminPassword)) {
            System.out.println("Привет, АДМИНЬ :)");
        } else {
            System.out.println("Ты кто такой?");
        }
    }

    public static void logicalInfo1() {
        // if
        // if-else
        // if-else if
        // if-else if-else
        // if - ТОЛЬКО один раз
        // else if - МНОГО раз
        // else - ТОЛЬКО один раз

        // "=" - оператор присвоения. Используется для того, чтобы записать значение в переменную
        //     int a = 20; // записали в a значение 20
        // "==" = оператор сравнения. Используется для сравнения двух чисел
        //        int a = 10;
        //        int b = 20;
        //        boolean bool = a == b;  // false

        int opr1 = 20;
        int opr2 = 30;
        int res = 0;

        // Записать в переменную res большее число
        // if-else вариант
        if (opr1 > opr2) {
            res = opr1;
            System.out.println("opr1 > opr2");
        } else {
            res = opr2;
            System.out.println("opr1 < opr2");
        }

        // тернарный оператор
        res = (opr1 > opr2) ? opr1 : opr2;
    }

    public static void switchExample1() {
        // Для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Канал ТВ
        int channel = 0;

        System.out.print("Введите значение канала на пульте (0-9): ");
        channel = scanner.nextInt();

        // 0<=channel<=9
        // Логические функции:
        // && - результат логического выражения будет истина, только в том случае
        //      если все условия истины

//       if (channel >= 0 && channel <=9){
//            if (channel == 0){
//                System.out.println("Нулевой канал");
//            }
//            else if (channel == 1){
//                System.out.println("Первый канал");
//            }
//            else if (channel == 2){
//                System.out.println("Второй канал");
//            }
//            else if (channel == 3){
//                System.out.println("Третий канал");
//            }
//            else if (channel == 4){
//                System.out.println("Четвертый канал");
//            }
//            else if (channel == 5){
//                System.out.println("Пятый канал");
//            }
//            else if (channel == 6){
//                System.out.println("Шестой канал");
//            }
//            else if (channel == 7){
//                System.out.println("Седьмой канал");
//            }
//            else if (channel == 8){
//                System.out.println("Восьмой канал");
//            }
//            else if (channel == 9){
//                System.out.println("Девятый канал");
//            }
//        }

        // channel - выражение селектор

        switch (channel) {
            // Если channel = 0
            case 0:
                System.out.println("Нулевой канал");
                break;
            // Если channel = 1
            case 1:
                System.out.println("Первый канал");
                break;
            case 2:
                System.out.println("Второй канал");
                break;
            case 3:
                System.out.println("Третий канал");
                break;
            case 4:
                System.out.println("Четвертый канал");
                break;
            case 5:
                System.out.println("Пятый канал");
                break;
            case 6:
                System.out.println("Шестой канал");
                break;
            case 7:
                System.out.println("Седьмой канал");
                break;
            case 8:
                System.out.println("Восьмой канал");
                break;
            case 9:
                System.out.println("Девятый канал");
                break;
            default:
                System.out.println("Введен некорректно канал");
                break;
        }
    }

    public static void switchExample2() {
        int day = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс дня недели: ");
        day = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Рабочий день.");
                break;
            case 6:
            case 7:
                System.out.println("Выходной день.");
                break;
            default:
                System.out.println("Некорректно введен день недели.");
        }
    }

    public static void correctInput() {
        // Вечный цикл
        while (true) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Введите число типа int : ");
                int a = Integer.parseInt(scanner.next());
                // Оператор завершения цикла
                break;
            } catch (Exception ex) {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
