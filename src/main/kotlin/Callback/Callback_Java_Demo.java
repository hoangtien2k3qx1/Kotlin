package Callback;

public class Callback_Java_Demo {

    private Listener listener;

    public Callback_Java_Demo(Listener listener) {
        this.listener = listener;
    }

    // Gọi đối tượng listener để sử dụng
    void someFunction() {
        listener.doThis();
        listener.doThat(12);
    }

    // Tạo một interface tên là Listener
    interface Listener {
        void doThis();

        void doThat(int number);
    }

}

class UsersClass {

    // Khởi tạo đối tượng listener
    Callback_Java_Demo.Listener listener = new Callback_Java_Demo.Listener() {
        @Override
        public void doThis() {
            System.out.println("Do this");
        }

        @Override
        public void doThat(int number) {
            System.out.println("Do that: " + number);
        }
    };

    // Truyền đối tượng qua hàm khởi tạo
    Callback_Java_Demo myClass = new Callback_Java_Demo(listener);


    public static void main(String[] args) {
        UsersClass usersClass = new UsersClass();
        usersClass.myClass.someFunction();
    }

}


