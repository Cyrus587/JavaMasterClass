public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes ){
        if(minutes < 0){
            System.out.println("Invalid Value");
        } else{

            long minutes_to_hours = 60 % minutes;
            long minutes_to_days = 24 % minutes_to_hours;
            long minutes_to_years = 365 % minutes_to_days;
            System.out.println(minutes + " min = "+ minutes_to_years + " y and " + minutes_to_days+ " d");



        }

    }
}
