package command;

public class MultiThreadingTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		Buffer buffer = new Buffer();
		Cliente cliente = new Cliente(buffer);
		cliente.setPriority(Thread.MAX_PRIORITY);		
		
		Agent agent = new Agent(buffer);
		agent.setPriority(Thread.MIN_PRIORITY);
		
		cliente.start();		
		agent.start();
		
	
	}

}
