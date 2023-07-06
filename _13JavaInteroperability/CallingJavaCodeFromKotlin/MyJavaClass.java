package _13JavaInteroperability.CallingJavaCodeFromKotlin;

public class MyJavaClass {
    public static void main(String[] args){

    }
    public static void add(int a,int b){
        int result = a + b;
        System.out.println("printing inside Java class :"+result);
    }

    public static int area(int l, int b){
        int result = l * b;
        return result;
    }

    /////
    protected String firstName;
    protected String lastName;

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

}
