package br.com.seniorsolution.bean;

import java.io.InputStream;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.UploadedFile;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Livro;

@ManagedBean(name="bLivro")
@RequestScoped
public class LivrosBean {
	@ManagedProperty(value="#{beanLivro}")
	
	private Livro livro;
	private UploadedFile uploadedFile;
	private List<Livro> livros;
	
	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public UploadedFile getUploadedFile() {
		System.out.println("teste1");
		return uploadedFile;
	}

	public void setUploadedFile(UploadedFile uploadedFile) {
		System.out.println("teste2");
		this.uploadedFile = uploadedFile;
	}

	//action incluirLivro
	public String incluirLivro() {
		System.out.println(this.getUploadedFile().getFileName());
		FacesContext ctx = FacesContext.getCurrentInstance();
		try {
			
			ctx.addMessage(null, new FacesMessage("Sucesso: ", " Livro cadastrado com sucesso."));
			
			System.out.println(this.getUploadedFile().getFileName());
			InputStream inputStream = this.getUploadedFile().getInputstream();
			byte[] imagem = new byte[(int)this.getUploadedFile().getSize()];
			
			inputStream.read(imagem, 0, (int)this.getUploadedFile().getSize());
			livro.setImagem(imagem);
			
			GenericDao<Livro> dao = new GenericDao<Livro>(Livro.class);
			dao.adicionar(livro);
			return "cadLivros";
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			ctx.addMessage(null, new FacesMessage("Erro: ", " Livro não foi cadastrado."));
			return "cadLivros";
		}		
	}
	
	//action getListaLivros()
	public List<Livro> getListaLivros(){
		GenericDao<Livro> dao = new GenericDao<>(Livro.class);
		return dao.listar();
	}
}
