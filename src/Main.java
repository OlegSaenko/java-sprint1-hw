import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пришло время практики!");
        int stepsDayTarget = 10000;
        StepTracker stepTracker = new StepTracker();
        Scanner scanner = new Scanner(System.in);
        MenuPrinter MenuPrinter = new MenuPrinter();
        MenuPrinter.printMenu();
        int userInput = scanner.nextInt();


        while (userInput != 4) {

            if (userInput > 4 || userInput <= 0) { // Проверяем корректность выбора меню
                System.out.println("Такой команды нет в меню, повторите ввод.");

            } else if (userInput == 1) {
                System.out.println("Выберите за какой месяй Вы хотите ввести данные: 0-Янв., 1-Фев., 2-Мар., 3-Апр., 4-Май, 5-Июн., 6-Июл., 7-Авг.,8-Сен., 9-Окт., 10-Ноя., 11-Дек.");
                int month = scanner.nextInt();
                    if (month > 11 || month < 0) { // Возможность скорретировать ввод
                        System.out.println("Месяцев 11, повторите ввод");
                        month = scanner.nextInt();
                    }
                System.out.println("Выберите за какое число месяца Вы хотите ввести количестов шагов.");
                int day = scanner.nextInt();
                    if (day > 30 || day <= 0 ) { // Возможность скорретировать ввод
                        System.out.println("В месяце 30 дней, повторите ввод");
                        day = scanner.nextInt();
                    }
                System.out.println("Введите колличество шагов.");
                int steps = scanner.nextInt();
                    if (steps < 0) { // Возможность скорретировать ввод
                        System.out.println("Количество шагов не может быть отрицательным, повторите ввод");
                        steps = scanner.nextInt();
                    }
                stepTracker.saveStepsQty(month, day, steps);

            } else if (userInput == 2) {
                System.out.println("Выберите за какой месяй Вы хотите узнать статистику: 0-Янв., 1-Фев., 2-Мар., 3-Апр., 4-Май, 5-Июн., 6-Июл., 7-Авг.,8-Сен., 9-Окт., 10-Ноя., 11-Дек.");
                int month = scanner.nextInt();
                stepTracker.printMonthStatistic(month, stepsDayTarget);

            } else if (userInput == 3) {
                System.out.println("Введите новое значение целевого количестваа шагов за день: ");
                int stepsDayTargetControl = scanner.nextInt();
                    if (stepsDayTargetControl < 0) { // проверяем ввод значения
                        System.out.println("Не ленитесь, количество шагов должно быть больше 0");
                    } else {
                        stepsDayTarget = stepsDayTargetControl;
                    }
            } else {
                break;
            }
            MenuPrinter.printMenu();
            userInput = scanner.nextInt();
        }
    }

    public static class MenuPrinter {
        void printMenu() {
            System.out.println("Что Вы хотите сделать? Укажите номер меню:");
            System.out.println("1. - Ввести количество шагов за определённый день;");
            System.out.println("2. - Напечатать статистику за определённый месяц;");
            System.out.println("3. - Изменить цель по количеству шагов в день;");
            System.out.println("4. - Выйти из приложения.");
        }
    }
}



