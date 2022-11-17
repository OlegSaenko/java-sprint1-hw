public class Converter {

    int convertToDistance(int totalStepsPerMonth) {
        return totalStepsPerMonth * 75 / 100_000;
    }

    int convertToCalories(int totalStepsPerMonth) {
        return totalStepsPerMonth * 50 / 1_000;
    }
}