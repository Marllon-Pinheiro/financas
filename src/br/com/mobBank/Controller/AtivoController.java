package br.com.mobBank.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mobBank.Connection.ConnectionFactory;
import br.com.mopBank.Model.Ativo;

public class AtivoController {

	public void save(Ativo ativo) throws Exception {
		String sql = "INSERT INTO ativos (nome, preco) VALUES (? , ?)";
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, ativo.getNome());
			statement.setFloat(2, ativo.getPreco());
			statement.execute();
		} catch(SQLException ex) {
			throw new RuntimeException("Erro ao salvar ativo");
		} finally {
			connection.close();
		}
	}
	
	public void update(Ativo ativo) throws Exception {
		String sql = "UPDATE ativos SET nome = ?, preco = ? WHERE id = ?";
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnection();
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, ativo.getNome());
			statement.setFloat(2, ativo.getPreco());
			statement.setInt(3, ativo.getId());
			statement.execute();
		} catch(SQLException ex) {
			throw new RuntimeException("Erro ao atualizar ativo", ex);
		} finally {
			connection.close();
		}
	}
	
}
