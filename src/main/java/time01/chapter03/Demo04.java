package time01.chapter03;
//线程组优先级&线程优先级
public class Demo04 {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("t1");
        threadGroup.setMaxPriority(6);
        Thread thread = new Thread(threadGroup, "thread");
        thread.setPriority(9);
        System.out.println("线程组优先级" + threadGroup.getMaxPriority());
        System.out.println("线程优先级" + thread.getPriority());
//    如果某个线程优先级大于线程所在线程组的最大优先级，那么该线程的优先级将会失效，取而代之的是线程组的最大优先级。
    }
}
