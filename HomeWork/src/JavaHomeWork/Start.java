package JavaHomeWork;

public class Start {
    public static void main(String [] args){
        Circle circle= new Circle(1);
        System.out.println("The Circle Perimeter is: " + circle.calculatePerimeter());
        System.out.println("The Circle Area is: " + circle.calculateArea());

        Rectangle rectangle= new Rectangle(5,2);
        System.out.println("The Rectangle Perimeter is: " + rectangle.calculatePerimeter());
        System.out.println("The Rectangle area is: "+ rectangle.calculateArea());


    }
}
