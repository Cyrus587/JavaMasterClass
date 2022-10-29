public class speed_convertor {

        public static long toMilesPerHour(double kilometersPerHour) { //whatever the return type is the method should be declared with that variable decleration in this case long

            if(kilometersPerHour < 0) {
                return -1;
            }

            return Math.round(kilometersPerHour / 1.609);
        }
    }

