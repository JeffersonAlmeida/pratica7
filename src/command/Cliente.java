package command;

import java.util.Random;


// Client colocar solicitações na fila

public class Cliente extends Thread{
	
	private Buffer buffer;
	private int quantComands = 0; // quantidade de comandos criados pela thread
	private int compras;
	private int vendas;
	
	public Cliente(Buffer buffer){
		this.setBuffer(buffer);
	}
	public void setBuffer(Buffer buffer) {
		this.buffer = buffer;
	}
	public Buffer getBuffer() {
		return buffer;
	}
	
	public void run(){
	
		Compra compra = new Compra("");
		compra.setId(compras);
		System.out.println("Insere Solicitação :: "+compra.toString());
		CompraCommand compraCommand = new CompraCommand(compra);
		buffer.placeCommand(compraCommand);
		
		/*
		Command[] commands = new Command[30];
		for(int i = 0 ; i< 30; i++){
			commands[i] = this.criaCommand();
			buffer.placeCommand(commands[1]);
		}
		*/	
		
	}
	
	public Command criaCommand(){
		Random random = new Random();
		int n = random.nextInt(2);		
		Command c = new NoCommnad();
		if(n==1){
			Compra compra = new Compra(quantComands+"");
			compra.setId(compras);
			System.out.println("Inserindo uma Solicitacao :: "+ compra.toString());
			c = new CompraCommand(compra);
			compras++;
		}
		else{
			 Venda venda = new Venda(quantComands+"");
			 venda.setId(vendas);
			 System.out.println("Inserindo uma Solicitacao :: "+ venda.toString());
			 c = new VendaCommand(venda);
			 vendas++;
		
		}
		quantComands++;		
		return c;
	}
	public void setCompras(int compras) {
		this.compras = compras;
	}
	public int getCompras() {
		return compras;
	}
	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	public int getVendas() {
		return vendas;
	}
}
