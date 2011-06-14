package command;

public class NoCommnad implements Command {
	public NoCommnad(){
		super();
	}
	@Override
	public void execute() {
		System.out.println("No command");
	}

}
