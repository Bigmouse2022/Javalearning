package duoxiancheng__6_3;

class MyThread1 implements Runnable {
    int i = 1;

    @Override
    public void run() {
        while (i <= 10) {
            System.out.println(Thread.currentThread().getName() + "执行第" + (i++) + "次");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class SleepDemo {
    public static void main(String[] args) {
        MyThread1 mt = new MyThread1();
        Thread t = new Thread(mt);
        t.start();

        Thread t1 = new Thread(mt);
        t1.start();
    }
}
