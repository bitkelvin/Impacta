package br.com.seniorsolution.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Disciplina;
import br.com.seniorsolution.entidades.Escola;

public class JdbcDisciplinaDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	//propriedade: dataSource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//método para incluir um novo curso
	public void incluirDisciplina(Disciplina disciplina) throws Exception{
		try {
			String sql = "INSERT INTO DISCIPLINA "
					+ "(IDCURSO,DESCRICAO,CH) VALUES (?,?,?)";
			jdbcTemplate.update(
					sql, 
					disciplina.getCurso().getId(),
					disciplina.getDescricao(),
					disciplina.getCh());
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public List<Disciplina> listarDisciplinas(int idcurso) throws Exception{
		List<Disciplina> disciplinas = new ArrayList<>();
		try {
			disciplinas = this.jdbcTemplate.query("SELECT * FROM DISCIPLINA WHERE IDCURSO = ?", new Integer[] {idcurso}, new DisciplinaMapper());
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		return disciplinas;
	}
	
	public void remover(Disciplina disciplina) {
		try {
			String sql = "DELETE FROM DISCIPLINA WHERE ID = ?";
			this.jdbcTemplate.update(sql, disciplina.getId());
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
	public Disciplina buscarDisciplina(int id) throws Exception {
		Disciplina disciplina = null;
		try {
			String query = "SELECT * FROM DISCIPLINA WHERE ID= ? ";
			disciplina = this.jdbcTemplate.queryForObject(
					query, 
					new Integer[] {id}, new DisciplinaMapper());
		} catch (Exception e) {
			throw e;
		}
		return disciplina;
	}
}
