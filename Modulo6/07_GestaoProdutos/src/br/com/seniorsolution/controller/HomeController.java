package br.com.seniorsolution.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Contato;
import br.com.seniorsolution.entity.Produto;

@Controller
public class HomeController {
	
	@CrossOrigin
	@RequestMapping("/wsjson")
	@ResponseBody
	public List<Produto> buscarAllProdutos(){
		return new GenericDao<>(Produto.class).listar(); 
	}
	
	@CrossOrigin
	@RequestMapping(value="/wsjson", method=RequestMethod.POST)
	@ResponseBody
	public List<Produto> incluirProduto(@RequestBody Produto produto){
		GenericDao<Produto> dao = new GenericDao<>(Produto.class);
		try {
			dao.adicionar(produto);
			return dao.listar();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@CrossOrigin
	@RequestMapping("/wsjsonagenda")
	@ResponseBody
	public List<Contato> buscarAllContatos(){
		return new GenericDao<>(Contato.class).listar(); 
	}
	
	@CrossOrigin
	@RequestMapping(value="/wsjsonagenda", method=RequestMethod.POST)
	@ResponseBody
	public List<Contato> incluirContato(@RequestBody Contato contato){
		GenericDao<Contato> dao = new GenericDao<>(Contato.class);
		try {
			dao.adicionar(contato);
			return dao.listar();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@CrossOrigin
	@RequestMapping(value="/wsjsonagenda/remover", method=RequestMethod.POST)
	@ResponseBody
	public List<Contato> removerContato(@RequestBody Contato contato){
		GenericDao<Contato> dao = new GenericDao<>(Contato.class);
		try {
			dao.remover(contato.getId());
			return dao.listar();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	@CrossOrigin
	@RequestMapping(value="/wsjsonagenda/alterar", method=RequestMethod.POST)
	@ResponseBody
	public List<Contato> alterarContato(@RequestBody Contato contato){
		GenericDao<Contato> dao = new GenericDao<>(Contato.class);
		try {
			dao.alterar(contato.getId(), contato);
			return dao.listar();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
}
