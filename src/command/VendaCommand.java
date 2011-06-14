package command;

public class VendaCommand implements Command{
	private Venda venda;
	public VendaCommand(Venda venda){
		this.setVenda(venda);
	}
	@Override
	public void execute() {
		this.venda.toString();
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Venda getVenda() {
		return venda;
	}

}
