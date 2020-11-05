package time01.chapter03;
//3.2 线程的优先级
public class Demo02 {
    public static void main(String[] args) {
        Thread a = new Thread();
        System.out.println(a.getPriority() + ":优先级");
        Thread b = new Thread();
        b.setPriority(10);
        System.out.println(b.getPriority() + ":优先级");
    }
}
