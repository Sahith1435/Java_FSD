package threads;

public class MyUserThread {
	public void run()
 	{
  		System.out.println("Welcome to Threads session");
 	}
 public static void main( String args[] )
 	{
  		MyUserThread mut = new  MyUserThread();
  		mut.start();
 	}
private void start() {
	// TODO Auto-generated method stub
	
}

}
