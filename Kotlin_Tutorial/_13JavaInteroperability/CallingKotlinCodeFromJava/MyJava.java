package _13JavaInteroperability.CallingKotlinCodeFromJava;

public class MyJava {
    public static void main(String[] args) {
        int area = MyKotlinKt.area(4,5);
        System.out.print("printing area inside Java class returning from Kotlin file: "+area);
    }
}
