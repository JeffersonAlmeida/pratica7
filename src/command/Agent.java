package command;

// Agent retirar estas solicitações e então executá-las ( execute() ).

public class Agent extends Thread{
	
	private Buffer buffer;
	public Agent(Buffer buffer){
		this.setBuffer(buffer);
	}
	public void setBuffer(Buffer buffer) {
		this.buffer = buffer;
	}
	public Buffer getBuffer() {
		return buffer;
	}
	
	public void run(){
		
		Command command = this.buffer.get(0); // O agente Consome
		command.execute();
		
	}
}
