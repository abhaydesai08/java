package test1;

public class CreateThread2 extends Thread {
@Override
public void run() {
	int num=5;
	int fact=1;
	try{for (int i = num; i >=1 ; i--) {
		
		fact=fact*i;
		System.out.println(fact);
		
			Thread.sleep(3000);}}
	 catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
}
}
