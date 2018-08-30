package br.com.seniorsolution.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Escola;

public class JdbcEscolaDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	//propriedade: dataSource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//método para incluir uma escola
	public void incluirEscola(Escola escola) throws Exception {
		try {
			String sql = "INSERT INTO ESCOLA "
					+ "(DESCRICAO,ENDERECO,DATAFUNDACAO) VALUES (?,?,?)";
			
			this.jdbcTemplate.update(
					sql, 
					escola.getDescricao(), 
					escola.getEndereco(), 
					escola.getDataFundacao());
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	//método para buscar uma escola
	public Escola buscarEscola(int id) throws Exception {
		Escola escola = null;
		try {
			String query = "SELECT * FROM ESCOLA WHERE ID= ? ";
			escola = this.jdbcTemplate.queryForObject(
					query, 
					new Integer[] {id}, new EscolaMapper());
		} catch (Exception e) {
			throw e;
		}
		return escola;
	}
	
	//método para listar todas as escolas
	public List<Escola> listarEscolas() throws Exception {
		List<Escola> escolas = new ArrayList<>();		
		try {
			escolas = this.jdbcTemplate.query(
					"SELECT * FROM ESCOLA", 
					new EscolaMapper());			
		} catch (Exception e) {
			throw e;
		}
		return escolas;
	}
	
	//método para remoção de escolas
	public void remover(Escola escola) {
		try {
			String sql = "DELETE FROM ESCOLA WHERE ID = ?";
			this.jdbcTemplate.update(sql, escola.getId());
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
}
