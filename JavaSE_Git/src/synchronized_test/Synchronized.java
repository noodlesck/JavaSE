package synchronized_test;

public class Synchronized {
     //1,同步方法 2,加入static关键字  
	 public  void method1(){
		 System.out.println("method1 start!");
		 
		 try {
			 synchronized(this){
			System.out.println("method1 excute"); 
			Thread.sleep(3000);}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("method1 end!");
	 }
	 //1,同步方法 2,加入static关键字  3,同步代码块
	 public  void  method2(){
		 System.out.println("method2 start!");
		 
		 try {
			 synchronized(this){
			 System.out.println("method2 excute");
			Thread.sleep(1000);}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("method2 end");
	 }
	
	
	
	
	
	
	public static void main(String[] args) {
		
	Synchronized sync = new Synchronized();
	//Synchronized sync1 = new Synchronized();
		
	new Thread(new Runnable(){
			@Override
			public void run(){
				sync.method1();
			}
	}).start();
	
	new Thread(new Runnable(){

		@Override
		public void run() {
			sync.method2();
			}
	}).start();
	
	

	}

}
