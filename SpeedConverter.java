public class SpeedConverter {
    public static double toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;

        } else {
            long MilesPerHour = Math.round(kilometersPerHour/ 1.609);
            return MilesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");


        }else{
            System.out.println(kilometersPerHour + "kph =" + toMilesPerHour(kilometersPerHour));

        }
    }
}








