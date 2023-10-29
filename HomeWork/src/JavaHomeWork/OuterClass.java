package JavaHomeWork;

public class OuterClass {
    private int outerNumber;
    private String outerString;

    public OuterClass(String outerString,int outerNumber){
        this.outerNumber =outerNumber;
        this.outerString = outerString;
    }

    public class InnerClass{
        public void display(){
            System.out.println("The values of String and Int in OuterClass are:  " + outerString + outerNumber);
        }
    }

    static class StaticNestedClass{
        public static void staticDisplay(){
            System.out.println("Static Nested Class");
        }
    }

    public void demoLocalClass(){
        class LocalClass{
            public void localDisplay(){
                System.out.println("Local Class");
            }
        }
        LocalClass localclass = new LocalClass();
        localclass.localDisplay();
    }
}
