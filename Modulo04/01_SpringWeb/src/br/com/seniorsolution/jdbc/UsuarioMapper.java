package br.com.seniorsolution.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.seniorsolution.entidades.Usuario;

public class UsuarioMapper implements RowMapper<Usuario>{

	@Override
	public Usuario mapRow(ResultSet rs, int arg1) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setNome(rs.getString("NOME"));
		usuario.setSenha(rs.getString("SENHA"));
		usuario.setNivel(rs.getInt("NIVEL"));
		return usuario;
	}

}
