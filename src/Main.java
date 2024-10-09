import java.time.LocalDate;

public class Main {
    public static void findLeapYear(int year) {
        if (year < 1584) {
            System.out.println("Год не может быть меньше 1584.");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void downloadCorrectVersion(int clientOS, int clientDeviceYear) {
        String version;
        if (clientOS == 0) {
            version = (clientDeviceYear >= 2015)
                    ? "Установите версию приложения для iOS по ссылке."
                    : "Установите облегченную версию приложения для iOS по ссылке.";
            System.out.println(version);
        } else if (clientOS == 1) {
            version = (clientDeviceYear >= 2015)
                    ? "Установите версию приложения для Android по ссылке."
                    : "Установите облегченную версию приложения для Android по ссылке.";
            System.out.println(version);
        }
    }

    public static int findDeliveryTime(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

        public static void main (String[]args) {

            // Task #1
            int year = 2023;
            findLeapYear(year);

            // Task #2
            int clientDeviceYear = LocalDate.now().getYear();
            int clientOS = 0;
            downloadCorrectVersion(clientOS, clientDeviceYear);

            // Task #3
            int deliveryDistance = 99;
            int deliveryDays = findDeliveryTime(deliveryDistance);
            if (deliveryDays > 0) {
                System.out.println("Потребуется дней: " + deliveryDays);
            } else {
                System.out.println("В этом радиусе доставки нет.");
            }
        }
    }