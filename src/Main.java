public class Main {
    public static void main(String[] args) {
        //Task 1
        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Другого выбора нет");
        }

        System.out.println();
        //Task 2
        clientOS = 1;
        short year = 2013;
        if (year <= 2015) {
            if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        System.out.println();
        //Task 3
        year = 2000;
        if (year > 1584) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (year % 100 == 0) {
                System.out.println(year + " год не является високосным");
            } else if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        // Task 4
        byte deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставка недоступна");
        }

        System.out.println();
        //Task 5
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}