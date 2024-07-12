package SOLID;

abstract class Shape {
    public abstract int getArea();
}

class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

public class LiskovSubstitution {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + rectangle.getArea());

        Square square = new Square(5);
        System.out.println("Square area: " + square.getArea());

        rectangle.setWidth(10);
        rectangle.setHeight(20);
        System.out.println("Rectangle area after dimension change: " + rectangle.getArea());
        square.setSide(10);
        System.out.println("Square area after side change: " + square.getArea());
    }
}

