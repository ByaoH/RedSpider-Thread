package time01.chapter03;
//3.1 线程组(ThreadGroup)
public class Demo01 {
    public static void main(String[] args) {
        new Thread(() ->{
            System.out.println("Thread当前线程组的名字:" +
                    Thread.currentThread().getThreadGroup().getName());
            System.out.println("Thread当前线程的名字" +
                    Thread.currentThread().getName());
        }).start();
        System.out.println("main当前线程组的名字:" +
                Thread.currentThread().getThreadGroup().getName());
        System.out.println("main当前线程的名字" +
                Thread.currentThread().getName());
    }
}
