package _11KotlinOOPs.NestedXClassAndInnerClass;

public class OuterClass_NestedClass_Java {
    public static int outerStaticVariable = 10;

    public int outerInstanceVariable = 20;

    // Nested class
    public static class NestedClass {
        public static String value1 = "12345";
        void display() {
            System.out.println("Outer static variable: " + outerStaticVariable); // chi có thể truy xuất được các thuộc tính static
            // Không thể truy cập vào outerInstanceVariable, vì nó không phải là static
        }
    }

    public static void main(String[] args) {
        OuterClass_NestedClass_Java.NestedClass nestedObject = new OuterClass_NestedClass_Java.NestedClass();
        nestedObject.display();

        System.out.println(nestedObject.value1);

        nestedObject.value1 = "1124";

    }
}
