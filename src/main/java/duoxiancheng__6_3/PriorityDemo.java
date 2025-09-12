package duoxiancheng__6_3;
class MyThread4 extends Thread {
    private String name;
    public MyThread4(String name){
        this.name=name;
    }
    public void run() {
        for (int i=0;i<50;i++){
            System.out.println(name + "正在运行");
        }
    }
}
public class PriorityDemo {
    public static void main(String[] args) {
        //获取主线程的优先级
        int mainPriority=Thread.currentThread().getPriority();
        System.out.println("主线程的优先级为"+mainPriority);//5
        //自定义线程
        MyThread4 mt1=new MyThread4("线程1");
        MyThread4 mt2=new MyThread4("线程2");
        mt1.setPriority(Thread.MAX_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);
        mt1.start();
        mt2.start();
    }
}
