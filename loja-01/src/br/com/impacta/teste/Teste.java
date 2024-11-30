package br.com.impacta.teste;

import java.util.Calendar;
import java.util.Date;

import br.com.impacta.bean.PessoaBean;
import br.com.impacta.conexao.ConexaoFactory;

public class Teste {

	public static void main(String[] args) {
//
//	ConexaoFactory cf = new ConexaoFactory();
//	
//	cf.getConexao();
//		

	PessoaBean pessoaBean = new PessoaBean();	
	
	pessoaBean.setNome("Juca");
	Date dtNasc = new Date();
	dtNasc.setTime(Calendar.getInstance().getTimeInMillis());
	pessoaBean.setDtNasc(dtNasc);
	
	
	System.out.println(pessoaBean.getNome()); 
	}

}

