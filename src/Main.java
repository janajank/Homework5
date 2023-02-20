public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача1");
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");}
    }

    public static void task2 () {
        System.out.println("Задача2");
        int clientOs = 0;
        int clientDeviceYear = 2016;
        if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            if (clientDeviceYear >=2015 && clientOs == 1)
                System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >=2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear >=2015 && clientOs == 1)
                System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task3 () {
        System.out.println("Задача3");
        int year = 2023;
        if ( (year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0 ) ) {
            System.out.println(year + " год является високосным");}
        else {
            System.out.println(year + " год не является високосным");}

    }

    public static void task4 () {
        System.out.println("Задача4");
       int deliveryDistance = 95;
       if ( deliveryDistance <= 20) {
           System.out.println(" 1 day");}
       if ( deliveryDistance > 20 && deliveryDistance <=60) {
           System.out.println( "2 days");}
       if (deliveryDistance > 60 && deliveryDistance <100 ) {
           System.out.println("3days");
       } else {
           System.out.println("Нет доставки!");}
    }

    public static void task5 () {
        System.out.println("Задача5");
        int monthNumber = 13;
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
            System.out.println("Программа не выполняется");
    }
    }

}