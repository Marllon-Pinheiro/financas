package br.com.mopBank.Model;
import br.com.mopBank.Enums.TipoAtivo;

public class Ativo {

	private int id;
	private String nome;
	private float preco;
	private TipoAtivo tipo;
	private int quantidade;
	
	public Ativo() {
		
	}
	
	public Ativo(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public TipoAtivo getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtivo tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}




