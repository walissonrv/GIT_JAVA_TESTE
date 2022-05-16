package exemplo_HERANÇA_1;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Pessoa_Telefone> telefones = new ArrayList<Pessoa_Telefone>();
		
		//Instanciação da classe pessoa fisica
				Pessoa_Fisica flavio = new Pessoa_Fisica();
				flavio.setIdPessoa(1);
				flavio.setCpf("123");
				flavio.setNome("Flávio Vilela");
				
				//Criar um telefone
				Pessoa_Telefone telefone1 = new Pessoa_Telefone();
				telefone1.setId(1);
				telefone1.setTelefone("333-4444");
				
				//Criar outro telefone
				Pessoa_Telefone telefone2 = new Pessoa_Telefone();
				telefone2.setId(2);
				telefone2.setTelefone("555-6666");
				
				//Adicionar os telefones dentro da lista de telefones
				telefones.add(telefone1);
				telefones.add(telefone2);
				
				//Adicionei a lista de telefones na pessoa
				flavio.setTelefones(telefones);
				
				System.out.println(flavio.getNome());
				for (Pessoa_Telefone pessoa_Telefone : telefones) {
					System.out.println(pessoa_Telefone.getTelefone());
				}
			}
		

	}


