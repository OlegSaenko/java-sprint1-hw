public class StepTracker {
    MonthData[] monthToData;
    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++)
            monthToData[i] = new MonthData();
    }
    int saveStepsQty(int month, int day, int steps) {
        monthToData[month] = MonthData.saveDaySteps(day, steps);
    }

    void giveStatus(int month) {
        System.out.println(monthToData[month]);

    }
}

