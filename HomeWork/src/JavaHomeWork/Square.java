package JavaHomeWork;

public class Square extends Shape{
    private double side;

    public Square (double side){
        if (side <=0){
            System.out.println("Side length value should be a positive number for the calculation to be complete");
            return;
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return  4 * side;
    }
}
