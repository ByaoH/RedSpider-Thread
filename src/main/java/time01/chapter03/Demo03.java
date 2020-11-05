package time01.chapter03;

import java.util.stream.IntStream;

//验证线程优先级
public class Demo03 {
    static class T1 extends Thread {
        @Override
        public void run() {
            System.out.printf("当前执行的线程是：%s，优先级%d \n"
                    , Thread.currentThread().getName()
                    , Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        IntStream.range(1, 10).forEach(i ->{
            Thread thread = new Thread(new T1());
            thread.setPriority(i);
            thread.start();
        });
    }
}
