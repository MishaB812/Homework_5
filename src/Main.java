public class Main
{
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1 () {
        System.out.println("Задача 1");
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int clientDeviceYear = 2016;
        int clientOs = 1;
        if (clientOs == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облеченную версию приложения для iOS по ссылке");
            }else{
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }else if (clientDeviceYear < 2015) {
            System.out.println("Установите облеченную версию приложения для Android по ссылке");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке");
        }


    }

    public static void task3 () {
        System.out.println("Задача 3");
        int UserYear = 2021;
        boolean isLeapYear = ((UserYear % 4 == 0) && (UserYear % 100 != 0) || (UserYear % 400 == 0));
        if (isLeapYear) {
            System.out.println(UserYear +  " год является високосным");
        }else{
            System.out.println(UserYear +  " год является не високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 99;
        if (deliveryDistance <= 20 ) {
            System.out.println("Потребуется дней: 1");
        }else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }}