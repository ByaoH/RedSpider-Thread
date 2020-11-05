package time01.chapter02;

import java.util.concurrent.*;
//Callable 接口
public class Task01 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 2;
    }

    public static void main(String[] args) throws Exception {
//        线程池
        ExecutorService service = Executors.newCachedThreadPool();
        Task01 task = new Task01();
        Future<Integer> result = service.submit(task);
        System.out.println(service.submit(() -> {
            System.out.println("shabi");
            return "有没有热水";
        }).get());
        // 注意调用get方法会阻塞当前线程，直到得到结果。
        // 所以实际编码中建议使用可以设置超时时间的重载get方法。
        Integer x = result.get();
        System.out.println(x);

        service.shutdown();
    }
}
