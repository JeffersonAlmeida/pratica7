package command;

import java.util.ArrayList;
public class Buffer {
	
		protected static final int maxSize = 10;
		
		protected static ArrayList<Command> commandQueue = new ArrayList<Command>();
		
		public synchronized boolean placeCommand(Command c){
			boolean flag = false;
			while(commandQueue.size() == maxSize) {
				try {
					System.out.println("Cliente dormiu...buffer cheio");
					wait();
					//Thread.sleep(5000);
				}
					catch(InterruptedException e){
					System.out.println(e.getMessage());
				}
			}
			commandQueue.add(c);
			flag = true;
			notifyAll();
			return flag;
		}
		public synchronized Command get(int i){
			Command c = null;
			while (commandQueue.size() == 0){
				try {
					System.out.println("Agent dormiu...buffer vazio");
					//Thread.sleep(5000);
					wait();
				}
				catch (InterruptedException e){
					System.out.println(e.getMessage());
				}
			}
			c = commandQueue.get(i);
			commandQueue.remove(i);
			notifyAll();
			return c;
		}
		public static ArrayList<Command> getCommandQueue() {
			return commandQueue;
		}
		public static void setCommandQueue(ArrayList<Command> commandQueue) {
			Buffer.commandQueue = commandQueue;
		}
		
		
}