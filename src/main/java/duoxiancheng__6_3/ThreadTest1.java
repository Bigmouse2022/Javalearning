package duoxiancheng__6_3;
//使用Tread类创建线程
class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(getName() + "线程正在运行");
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        System.out.println("主线程1");
        MyThread mt1 = new MyThread("线程1");
        MyThread mt2 = new MyThread("线程2");
        mt1.start();
        mt2.start();
        System.out.println("主线程2");
    }
}
