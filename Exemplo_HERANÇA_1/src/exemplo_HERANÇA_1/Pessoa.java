package exemplo_HERANÇA_1;
import java.util.List;

public class Pessoa {
	private int idPessoa;
	private String nome;
	private String endereco;
	private String telefone;
	private List<Pessoa_Telefone> telefones;
	
	
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public List<Pessoa_Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Pessoa_Telefone> telefones) {
		this.telefones = telefones;
	}
	
	

}
