package _11KotlinOOPs.NestedXClassAndInnerClass;

public class OuterClass_InnerClass_Java {
    private static int outerInstanceVariable = 20;
    private int outerVariable = 123;

    // Inner class
    public class InnerClass {
        private String value1 = "12312";
        void display() {
            System.out.println("Outer instance variable: " + outerInstanceVariable); // truy xuất được các thuộc tính bên ngoài (private, public, protected, static)
            System.out.println("Outer outerVariable: " + outerVariable);
        }
    }

    public static void main(String[] args) {
        OuterClass_InnerClass_Java outerObject = new OuterClass_InnerClass_Java();
        OuterClass_InnerClass_Java.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();



    }
}
