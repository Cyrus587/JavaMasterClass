
public class area_challange {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            double area_of_circle = radius * radius * Math.PI;
            return area_of_circle;
        }
    }

        public static double area(double x, double y){
            if(x<0) {
                return -1.0;
            }else if (y< 0) {
                return -1.0;
            }else{
                double area_of_x_and_y = x * y;
                return area_of_x_and_y;
            }

        }
    }


