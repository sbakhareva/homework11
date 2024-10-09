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

    public static void findDeliveryTime(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance > 100) {
            System.out.println("В этом радиусе доставки нет.");
        }
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
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
            int deliveryDistance = 53;
            int deliveryDays = 1;
            findDeliveryTime(deliveryDistance, deliveryDays);
        }
    }