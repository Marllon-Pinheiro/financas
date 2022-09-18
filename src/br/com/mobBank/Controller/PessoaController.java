package br.com.mobBank.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.mobBank.Connection.ConnectionFactory;
import br.com.mopBank.Model.Pessoa;

public class PessoaController {

	public void save(Pessoa pessoa) throws Exception {
		
		String sql = "INSERT INTO pessoas (nome, cpf) VALUES ( ?, ?)";
		Connection connection = null;
		try{
			connection = ConnectionFactory.getConnection(); 
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, pessoa.getNome());
			statement.setString(2, pessoa.getCpf());
			statement.execute();
			
		} catch(SQLException ex) {
			throw new RuntimeException("Erro ao salvar projeto");
		} finally {
			connection.close();
		}
		
	}
	
	public void remove(int id) throws Exception {
		String sql = "DELETE FROM pessoas WHERE id = ?";
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.execute();
		} finally {
			connection.close();
		}
	}
	
	public void update(Pessoa pessoa) throws Exception {
		String sql = "UPDATE pessoas SET nome = ?, cpf = ? WHERE id = ?";
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, pessoa.getNome());
			statement.setString(2, pessoa.getCpf());
			statement.setInt(3, pessoa.getId());
			statement.execute();
		} catch(SQLException ex) {
			throw new RuntimeException("Erro ao atualizar pessoa", ex);
		} finally {
			connection.close();
		}
	}
	
	public List<Pessoa> getAll() throws Exception {
		String sql = "SELECT * FROM pessoas";
		Connection connection = null;
		ResultSet result = null;
		
		List<Pessoa> pessoas = new ArrayList<>();
		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			result = statement.executeQuery();
			while(result.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setId(result.getInt("id"));
				pessoa.setNome(result.getString("nome"));
				pessoa.setCpf(result.getString("cpf"));
				pessoas.add(pessoa);
			}
		} catch(SQLException ex) {
			throw new RuntimeException("Erro ao lista pessoas");
		} finally {
			connection.close();
		}
		return pessoas;
	}
	
	
}
