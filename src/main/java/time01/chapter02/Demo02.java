package time01.chapter02;
//实现Runnable
public class Demo02 implements Runnable{

    public void run() {
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Demo02());
        thread.start();
        new Thread(() -> {
            System.out.println("匿名内部类");
        }).start();
    }
}
