import br.com.mobBank.Controller.AtivoController;
import br.com.mopBank.Enums.TipoAtivo;
import br.com.mopBank.Model.Ativo;

public class main {

	public static void main(String[] args) throws Exception {

//		ConnectionFactory factory = new ConnectionFactory();
//		Connection connection = factory.getConnection();
//		
//		Statement stm = connection.createStatement();
//		stm.execute("INSERT INTO pessoas (nome, cpf) VALUES ('marllon','151.441.767-71')", 
//				Statement.RETURN_GENERATED_KEYS);
//		
//		ResultSet rst = stm.getGeneratedKeys();
//		while(rst.next()) {
//			Integer id = rst.getInt(1);
//			System.out.println("O id criado foi: " +id);
//		}

//		PessoaController controller = new PessoaController();
		
//		Pessoa pessoa = new Pessoa("milena","123.456.789-20");
//		pessoa.setId(5);
//		controller.save(pessoa);
//		controller.update(pessoa);
//		controller.remove(4);
		
//		System.out.println(controller.getAll());
		
//		-----------------------------
		
		AtivoController controller = new AtivoController();
		
		Ativo ativo = new Ativo("OIBR3", 18.5f);
//		ativo.setId(1);
		controller.save(ativo);
//		controller.update(ativo);
	}

}
