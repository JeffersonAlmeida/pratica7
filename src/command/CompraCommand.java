package command;

public class CompraCommand implements Command{

	private Compra compra;
	public CompraCommand(Compra c){
		this.compra = c;
	}
	
	@Override
	public void execute() {
		this.compra.toString();
	}


	public void setCompra(Compra compra) {
		this.compra = compra;
	}


	public Compra getCompra() {
		return compra;
	}

}
