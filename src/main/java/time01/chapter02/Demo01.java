package time01.chapter02;
//继承Thread类
public class Demo01 {
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("MyThread");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
