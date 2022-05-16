package exemplo_HERANÇA_1;

public class Pessoa_Juridica extends Pessoa {
	private String razao_social;
	private String data_abertura;
	private String cnpj;
	
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public String getData_abertura() {
		return data_abertura;
	}
	public void setData_abertura(String data_abertura) {
		this.data_abertura = data_abertura;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
