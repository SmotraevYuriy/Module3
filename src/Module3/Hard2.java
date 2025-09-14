package Module3;

public class Hard2 {
    public static void main(String[] args) {
        double x1 = 2;
        double y1 = 3;
        double x2 = 5;
        double y2 = 7;
        double x3 = 8;
        double y3 = 4;
        double d1 = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        double d2 = Math.sqrt(Math.pow(x3 - x1,2) + Math.pow(y3 - y1,2));
        double d3 = Math.sqrt(Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2));
        double p = (d1 + d2 + d3) / 2;
        double S = Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
        System.out.println("Площадь треугольника - " + S);

    }
}
