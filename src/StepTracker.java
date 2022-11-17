public class StepTracker {
    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++)
            monthToData[i] = new MonthData();
    }

    void saveStepsQty(int month, int day, int steps) {
        monthToData[month].dataStepsQty[day - 1] = steps;
    }

    void printMonthStatistic(int month, int stepsDayTarget) {
        int totalStepsPerMonth = 0; // переменная общего количества шагов в месяц
        int maxDailyStepsInMonth = 0; // переменная маскимально кол-ва шагов в лучший день
        int bestSeriesCounter = 0; // переменная для счета лучшей серии дней по кол-ву шагов
        int seriesCounter = 0; // переменная счетчик
        for (int i = 0; i < monthToData[month].dataStepsQty.length; i++) {
            System.out.print((i + 1) + " день: " + monthToData[month].dataStepsQty[i] + " шагов, ");
            totalStepsPerMonth += monthToData[month].dataStepsQty[i];
            if (maxDailyStepsInMonth < monthToData[month].dataStepsQty[i]) {
                maxDailyStepsInMonth = monthToData[month].dataStepsQty[i];
            }
            if (monthToData[month].dataStepsQty[i] >= stepsDayTarget) {
                seriesCounter += 1;
            } else {
                if (seriesCounter > bestSeriesCounter) {
                    bestSeriesCounter = seriesCounter;
                    seriesCounter = 0; // обнуляем счетчик серии
                } else {
                    seriesCounter = 0; // обнуляем счетчик серии
                }
            }
        }
        System.out.println();
        System.out.println("Общее количество шагов за месяц " + totalStepsPerMonth);
        System.out.println("Максимальное пройденное количество шагов в день в месяц " + maxDailyStepsInMonth);
        System.out.println("Среднее количество шагов в месяц " + (totalStepsPerMonth / 30));
        Converter Converter = new Converter();
        System.out.println("Пройденная дистаанция в км " + Converter.convertToDistance(totalStepsPerMonth));
        System.out.println("Расходованные кило каллории " + Converter.convertToCalories(totalStepsPerMonth));
        System.out.println("Лучшая серия дней в месяце " + bestSeriesCounter);
    }
}