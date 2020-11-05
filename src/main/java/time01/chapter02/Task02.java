package time01.chapter02;
// 自定义Callable，与上面一样

import java.util.concurrent.*;

public class Task02 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 2;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(new Task02());
        service.submit(futureTask);
        System.out.println(futureTask.get());
    }
}
