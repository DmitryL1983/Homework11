import java.time.LocalDate;

public class Main {
    public static void printSeparator() {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("-----------------------");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void printYearCheck() { //Метод проверки года (високосный или нет) к заданию 1
        int currentYear = LocalDate.now().getYear();
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println(currentYear + " год является високосным");
        } else {
            System.out.println(currentYear + " год не является високосным");
        }
    }

    public static void applicationSelection(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        switch (clientOS) {
            case 0:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Ваша ОС не поддерживается. Используйте устройство Android или iOS");
        }
    }

    public static void main(String[] args) {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8,};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);

        // задание 1
        // Реализуйте метод, который получает в качестве параметра год, а затем проверяет,
        // является ли он високосным, и выводит результат в консоль.
        printYearCheck();

        // задание 2
        // Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android)
        // и год выпуска устройства. Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
        int clientDeviceYear = 2020;
        int clientOS = 1;
        applicationSelection(clientDeviceYear, clientOS);

        // задание 3
        // В задаче (доставка банковской карты) доработать код, а именно написать метод,
        // который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
        int deliveryDistance = 15;
        findingTravelTime(deliveryDistance);
        int deliveryTime = findingTravelTime(deliveryDistance);
        System.out.println("Потребуется дней " + deliveryTime);
    }

    public static int findingTravelTime(int deliveryDistance) { // метод расчета дистанции к задаче 3
        int deliveryTime = 0;
        if (deliveryDistance < 20) {
            deliveryTime = deliveryTime + 1;
            return deliveryTime;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 2;
            return deliveryTime;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime = deliveryTime + 3;
            return deliveryTime;
        } else {
            System.out.println("Уточните время на горячей линии банка");
            return deliveryTime;
        }
    }
}



