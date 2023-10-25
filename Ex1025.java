public class Ex1025 {

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double radius = 5.2;
        double circleArea = area(radius);
        System.out.println("The area of a circle with radius " + radius + " is: " + circleArea);

        double length = 4.5;
        double width = 10.0;
        double rectangleArea = area(length, width);
        System.out.println("The area of a rectangle with length " + length + " and width " + width + " is: " + rectangleArea);
    }
}
