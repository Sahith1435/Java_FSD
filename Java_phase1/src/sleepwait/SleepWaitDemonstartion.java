package sleepwait;

public class SleepWaitDemonstartion {
	private static Object lock = new Object();
	  
	 public static void main(String args[]) throws InterruptedException
		    {
		       Thread.sleep(1000);
		       System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
		       synchronized (lock) 
		       {
		         lock.wait(1000);
		         System.out.println("Object '" + lock + "' is woken after" + " waiting for 1 second");
		       }
		    }

}
