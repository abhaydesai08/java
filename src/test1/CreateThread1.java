package test1;

public class CreateThread1 implements Runnable{

	public static void main(String[] args) {
	
		CreateThread1 c1=new CreateThread1();
		
		Thread p2=new Thread(c1);
		
	
		
		CreateThread2 c2=new CreateThread2();
		
		
		p2.start();
		c2.start();
		
		

	}

	@Override
	public void run() {
		int num=5;
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact=fact*i;
			System.out.println(fact);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
