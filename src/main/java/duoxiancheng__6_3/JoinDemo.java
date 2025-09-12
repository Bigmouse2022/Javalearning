package duoxiancheng__6_3;

class MyThread3 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(getName() + "正在执行" + i + "次");
        }

    }
}

public class JoinDemo {
    public static void main(String[] args) {
        MyThread3 mt = new MyThread3();
        mt.start();
        try {
            mt.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程运行第" + i + "次");
        }

    }
}
