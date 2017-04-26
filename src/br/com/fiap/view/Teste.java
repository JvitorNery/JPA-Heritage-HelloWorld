package br.com.fiap.view;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PessoaDAO;
import br.com.fiap.dao.impl.PessoaDAOImpl;
import br.com.fiap.entity.Pessoa;
import br.com.fiap.entity.PessoaFisica;
import br.com.fiap.entity.Sexo;
import br.com.fiap.exception.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {
	public static void main(String[] args) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		Pessoa p1 = new Pessoa();
		PessoaDAO dao = new PessoaDAOImpl(em);
		
		PessoaFisica pf = new PessoaFisica("Lucas","Av Lins","112233",Sexo.MASCULINO);
		try{
		dao.insert(pf);
		dao.save();
		}catch(CommitException e){
			e.printStackTrace();
		}
		em.close();
		System.exit(0);
		
		
		
	}
}
