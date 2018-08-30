package br.com.seniorsolution.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.seniorsolution.entidades.Disciplina;

public class DisciplinaMapper implements RowMapper<Disciplina> {

	@Override
	public Disciplina mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Disciplina disciplina = new Disciplina();
		
		disciplina.setId(rs.getInt("ID"));
		disciplina.setDescricao(rs.getString("DESCRICAO"));
		disciplina.setCh(rs.getInt("CH"));
		
		return disciplina;
	}
	
}
