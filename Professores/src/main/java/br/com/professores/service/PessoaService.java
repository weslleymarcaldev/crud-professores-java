package br.com.professores.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.professores.model.Pessoa;
import br.com.professores.repository.PessoaRepository;

@Stateless
public class PessoaService {

	@EJB
	private PessoaRepository pessoaRepository;
	
	public void create(Pessoa pessoa) {
		pessoaRepository.persist(pessoa);
	}
}
