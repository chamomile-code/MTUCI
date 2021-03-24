import java.text.DecimalFormat;
import java.util.Scanner;

    class Lab2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Point point1 = new Point();
            Point point2 = new Point();
            Point point3 = new Point();

            try {
                System.out.println("координаты точки 1");
                point1.setX(sc.nextDouble());
                point1.setY(sc.nextDouble());
                point1.setZ(sc.nextDouble());

                System.out.println("координаты точки2");
                point2.setX(sc.nextDouble());
                point2.setY(sc.nextDouble());
                point2.setZ(sc.nextDouble());

                System.out.println("координаты точки 3");
                point3.setX(sc.nextDouble());
                point3.setY(sc.nextDouble());
                point3.setZ(sc.nextDouble());
            } catch(Exception e) {
                System.out.println("ошибка");
                throw e;
            }

            double result = computeArea(point1, point2, point3);
            if (result != 0) {
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("Площадь = " + df.format(result));
            }
        }

        private static double computeArea(Point point1, Point point2, Point point3) {
            if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3)) {
                System.out.println("точки одинаковы");
                return 0d;
            }
            double a = point1.distanceTo(point2);
            double b = point2.distanceTo(point3);
            double c = point3.distanceTo(point1);
            double p = (a + b + c)/2d;
            return Math.sqrt(p*(p - a)*(p - b)*(p - c));
        }
    }
