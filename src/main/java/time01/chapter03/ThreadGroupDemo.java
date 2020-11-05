package time01.chapter03;
//线程组统一异常处理
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("group1"){
            // 在线程成员抛出unchecked exception
            // 会执行此方法
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName() + ":" + e.getMessage());
            }
        };
        new Thread(threadGroup, ()-> {
            throw new RuntimeException("测试异常");
        }).start();
        
    }
}
