public class StepTracker {
    MonthData[] monthToData ;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++)
            monthToData[i] = new MonthData();
    }

        void saveStepsQty(int month, int day, int steps) {
            monthToData[month].dataStepsQty[day - 1] = steps; // Двое суток боли, отчаяния, унижения, депресии в этой строчке =)
        }

        void printMonthStatistic(int month, int stepsDayTarget) {
            int stepsTtl = 0; // переменная общего количества шагов в месяц
            int maxStepsQty = 0; // переменная маскимально кол-ва шагов в лучший день
            int setStepsDayTarget = 0; // ??переменная для счета лучшей серии дней по кол-ву шагов
            int setcount = 0; // переменная для сечта дней больше целевого
            for (int i = 0; i < monthToData[month].dataStepsQty.length; i++) {
                System.out.print((i + 1) + " день: " + monthToData[month].dataStepsQty[i] + " шагов");
                stepsTtl += monthToData[month].dataStepsQty[i];
                if (maxStepsQty < monthToData[month].dataStepsQty[i]) {
                    maxStepsQty = monthToData[month].dataStepsQty[i];
                }
                if (monthToData[month].dataStepsQty[i] >= stepsDayTarget) {
                    setcount += 1;
                } else {
                    if (setcount > setStepsDayTarget) {
                        setStepsDayTarget = setcount;
                    }
                }
            }
            System.out.println();
            System.out.println("Общее количество шагов за месяц " + stepsTtl );
            System.out.println("Максимальное пройденное количество шагов в день в месяц " + maxStepsQty );
            System.out.println("Среднее количество шагов в месяц " + (stepsTtl / 30) );
            Converter Converter = new Converter();
            System.out.println("Пройденная дистаанция в км " + Converter.sumDistanceMonth(stepsTtl) );
            System.out.println("Расходованные кило каллории " + Converter.sumCaloriesMonth(stepsTtl) );
            System.out.println("Лучшая серия дней в месяце " + setStepsDayTarget );
        }
}


