public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        char clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Извините, такого приложения у нас нет");
        }

        //task 2
        System.out.println("task 2");
        char clientOS2 = 2;
        int clientDeviceYear = 2014 ;
        if (clientOS2 ==0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS2 == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Такого приложения у нас нет");
        }

        // task 3
        System.out.println("task 3");
        int year = 1584;
        if (year > 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");
            }
        } else {
            System.out.println("Тогда мы еще не знали про високосные года");
        }

// task 4
        System.out.println("task 4");
        int deliveryDistance = 100;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день доставки");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня доставки");
        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 дня доставки");
        }
        if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
        // task 5
        System.out.println("task 5");
        int month = 1;
        switch (month) {
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
                System.out.println("Такого месяца не существует!");
        }

    }
}