package br.com.professores.beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.professores.model.Pessoa;
import br.com.professores.service.PessoaService;

@Named
@RequestScoped
public class PessoaBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private PessoaService pessoaService;
	
	Pessoa pessoa = new Pessoa();
	
	public String gravar() {
		pessoa.setNome("Jose");
		pessoaService.create(pessoa);
		return "";
	}
}