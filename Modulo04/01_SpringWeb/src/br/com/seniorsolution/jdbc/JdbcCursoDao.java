package br.com.seniorsolution.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Curso;
import br.com.seniorsolution.entidades.Escola;

public class JdbcCursoDao {
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	//propriedade: dataSource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//método para incluir um novo curso
	public void incluirCurso(Curso curso) throws Exception{
		try {
			String sql = "INSERT INTO CURSO "
					+ "(IDESCOLA,DESCRICAO) VALUES (?,?)";
			jdbcTemplate.update(
					sql, 
					curso.getEscola().getId(),
					curso.getDescricao());
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	//método para buscar uma escola
	public Curso buscarCurso(int id) throws Exception {
		Curso curso = null;
		try {
			String query = "SELECT * FROM CURSO WHERE ID= ? ";
			curso = this.jdbcTemplate.queryForObject(
					query, 
					new Integer[] {id}, new CursoMapper());
		} catch (Exception e) {
			throw e;
		}
		return curso;
	}
	
	
	public List<Curso> listarCursos(int idescola) throws Exception {
		List<Curso> cursos = new ArrayList<>();		
		try {
			
			
			cursos = this.jdbcTemplate.query(
					"SELECT * FROM CURSO WHERE IDESCOLA=?",
					new Integer[] {idescola},
					new CursoMapper());			
		} catch (Exception e) {
			throw e;
		}
		return cursos;
	}
	
	public void remover(int id) {
		try {
			String sql = "DELETE FROM CURSO WHERE ID = ?";
			this.jdbcTemplate.update(sql, id);
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
}
