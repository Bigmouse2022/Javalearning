package duoxiancheng__6_3.queue;

public class Test {

	public static void main(String[] args) {
		Queue queue=new Queue();
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
	}

}
