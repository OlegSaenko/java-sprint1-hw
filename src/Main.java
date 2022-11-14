package StepTracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пришло время практики!");
        Scanner scanner = new Scanner(System.in);
        MenuPrinter MenuPrinter = new MenuPrinter();
        MenuPrinter.printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 4) {
            if (userInput > 4 || userInput <= 0) { // Проверяем корректность выбора меню (&& не уверн будет ли работать!)
                System.out.println("Такой комынды нет в меню, повторите ввод.");
            } else if (userInput == 1) {
                // вызов класса StepTracker.Main.StepTracker.StepTracker, метод ввода шагов в массив(месяц, день) (возможно выбор месяца, дня и кол-ва шагов надо оставить в StepTracker.Main)
                System.out.println("Выберите за какой месяй Вы хотите ввести данные: 0-Янв., 1-Фев., 2-Мар., 3-Апр., 4-Май, 5-Июн., 6-Июл., 7-Авг.,8-Сен., 9-Окт., 10-Ноя., 11-Дек.");
                int month = scanner.nextInt();
                System.out.println("Выберите за какое день месяца Вы хотите ввести количестов шагов.");
                int day = scanner.nextInt();
                System.out.println("Введите колличество шагов.");
                int steps = scanner.nextInt();
                if (steps < 0) {
                    System.out.println("Количество шагов не может быть отрицательным, обратитесь к врачу");
                }
                //StepTracker.saveStepsQty(month, day, steps);
                System.out.println("Вы внесли " + steps + " шагов " + day + " числа " + month + " месяца.");
            } else if (userInput == 2) {
                // вызов класса StepTracker.Main.StepTracker.StepTracker, метод печати статистики (возможно выбор месяца, надо оставить в StepTracker.Main)
                System.out.println("Выберите за какой месяй Вы хотите узнать статистику: 0-Янв., 1-Фев., 2-Мар., 3-Апр., 4-Май, 5-Июн., 6-Июл., 7-Авг.,8-Сен., 9-Окт., 10-Ноя., 11-Дек.");
                int month = scanner.nextInt();
                //StepTracker.giveStatus(month);
            } else if (userInput == 3) {
                // вызов класса StepTracker.Main.StepTracker.StepTracker, метод изменение целевого кол-ва шагов (цель одна на всех дней)
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


