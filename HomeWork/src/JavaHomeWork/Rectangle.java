package JavaHomeWork;

class Rectangle extends Shape{
    private double lenght;
    private double width;


    public Rectangle(double lenght,double width){
        this.lenght=lenght;
        this.width=width;
    }

    @Override
    public double calculateArea() {
        return lenght* width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (lenght*width);

    }
}
