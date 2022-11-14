class MonthData {

        int[] dataStepsQty;
        MonthData() {
            dataStepsQty = new int[30];
        }
        int saveDaySteps (int day, int steps) {
            dataStepsQty[day-1] = steps;
            return dataStepsQty[day-1];
        }
        void printStepsInDays(){
            for (int i = 0; i < dataStepsQty.length; i++){
                System.out.print( i + " день: " + dataStepsQty[i] + " шагов");
            }
        }
    }


