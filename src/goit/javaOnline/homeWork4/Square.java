package goit.javaOnline.homeWork4;

public class Square {

    private final double PI = 3.14;

    public void triangleSquare(int baseTriangle, int heightTriangle) {

        double s = 0.5 * baseTriangle * heightTriangle;

        System.out.println("Square triangle = " + s);

    }

    public void rectangleSquare(int sideA, int sideB) {

        int s = sideA * sideB;

        System.out.println("Square rectengle = " + s);

    }

    public void circleSquare(int radius) {

        double s = PI * (radius * radius);

        System.out.println("Square circle = " + s);

    }
}
