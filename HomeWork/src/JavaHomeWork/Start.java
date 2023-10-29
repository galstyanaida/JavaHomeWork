package JavaHomeWork;

public class Start {
    public static void main(String [] args){
        Circle circle= new Circle(1);
        System.out.println("The Circle Perimeter is: " + circle.calculatePerimeter());
        System.out.println("The Circle Area is: " + circle.calculateArea());

        Rectangle rectangle= new Rectangle(5,2);
        System.out.println("The Rectangle Perimeter is: " + rectangle.calculatePerimeter());
        System.out.println("The Rectangle Area is: "+ rectangle.calculateArea());

        Triangle triangle = new Triangle(-5, 3, 5, 6, 7);
        System.out.println("The Triangle Perimeter is: " + triangle.calculatePerimeter());
        System.out.println("The Triangle Area is: " + triangle.calculateArea());


        Square square = new Square(2);
        System.out.println("The Square Perimeter is : " + square.calculatePerimeter());
        System.out.println("The Square Area is: " + square.calculateArea());

        OuterClass outerClass = new OuterClass("Barev, ", 2);
        OuterClass.InnerClass innerClass= outerClass.new InnerClass();
        innerClass.display();

        OuterClass.StaticNestedClass.staticDisplay();

        outerClass.demoLocalClass();



    }
}
