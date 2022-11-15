public class Converter {
    int distance;
    int calories;

    int sumDistanceMonth ( int stepsTtl) {
        distance = stepsTtl * 75 / 100000;
        return distance;
    }

    int sumCaloriesMonth ( int stepsTtl ) {
        calories = stepsTtl * 50 / 1000;
        return calories;
    }
}
