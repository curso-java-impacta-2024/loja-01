package br.com.impacta.teste;

import java.util.Calendar;
import java.util.Date;

import br.com.impacta.bean.FilmeBEAN;
import br.com.impacta.bean.PessoaBean;
import br.com.impacta.bo.FilmeBO;
import br.com.impacta.conexao.ConexaoFactory;
import br.com.impacta.dao.FilmeDAO;

public class Teste {

	public static void main(String[] args) {
		
//	ConexaoFactory cf = new ConexaoFactory();
//	
//	cf.getConexao();
		
	//Instanciar Pessoa
//		PessoaBean pessoaBean;
//		
//	//Construi o objeto
//		pessoaBean = new PessoaBean();
//		
//		pessoaBean.setNome("Juca");
//		
//		Date dtNasc = new Date();
//		dtNasc.setTime(Calendar.getInstance().getTimeInMillis());
//		pessoaBean.setDtNasc(dtNasc);
//		
//		System.out.println(pessoaBean.getNome());
		
		FilmeBO fbo = new FilmeBO();
		FilmeBEAN fb = new FilmeBEAN();
		
		fb = fbo.listaFilme(1);
		
		System.out.println(fb.getTitulo());
		System.out.println(fb.getDuracao());
		
		fb.setDuracao(3.3);
		
		fbo.atualizaFilme(fb);
//		
//		System.out.println(fb.getTitulo());
//		System.out.println(fb.getDuracao());
		
	}

}

