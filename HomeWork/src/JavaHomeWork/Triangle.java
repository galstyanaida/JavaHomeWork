package JavaHomeWork;

class Triangle extends Shape{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base,double height, double side1, double side2, double side3) {
        if (base <= 0 || height <= 0 || side1 <= 0 || side2 <= 0 || side2 <= 0) {
            System.out.println("All dimensions should be positive numbers for the calculation to be complete");
            return;

        }

        this.base = base;
        this.height = height;
        this.side1= side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+ side3;
    }
}
