package command;

public class Venda {
	
	private int id = 0;
	private Long quantidade;
	private Double valor;
	private String nome;
	
	public Venda(Long q, Double v, String n){

		this.quantidade = q;
		this.valor = v;
		this.nome = n;
	}
	
	public Venda(String nome){
	
		this.quantidade = (long) Math.random();
		this.valor  = Math.random()*4;
		this.nome = nome;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Venda [id=" + getId() + ", quantidade=" + quantidade + ", valor="
				+ valor + ", nome=" + nome + "]";
	}
		
}
