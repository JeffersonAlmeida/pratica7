package command;

public class Compra {
	
	private int id;
	private Long quantidade;
	private Double valor;
	private String nome;
	
	public Compra(Long q, Double v, String n){
		
		this.quantidade = q;
		this.valor = v;
		this.nome = n;
	}
	
	
	@Override
	public String toString() {
		return "Compra [id=" + getId() + ", quantidade=" + quantidade + ", valor="
				+ valor + ", nome=" + nome + "]";
	}



	public Compra(String nome){
		this.quantidade = (long) Math.random();
		this.valor = Math.random()*4;
		this.nome = nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getValor() {
		return valor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}
