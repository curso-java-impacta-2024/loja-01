package br.com.impacta.teste;

import java.util.Calendar;
import java.util.Date;

import br.com.impacta.bean.PessoaBean;

public class Teste {

	public static void main(String[] args) {
		
	/*ConexaoFactory cf = new ConexaoFactory();
	
	cf.getConexao();*/
		
		
		//Instanciar Pessoa
		
		PessoaBean pessoaBean;
		
		//Construir o objeto
		
		pessoaBean = new PessoaBean();
		
		pessoaBean.setNome("Juca");
		
		Date dtNasc = new Date();
		dtNasc.setTime(Calendar.getInstance().getTimeInMillis());
		pessoaBean.setDtNasc(dtNasc);
		
		
		System.out.println(pessoaBean.getNome());
		
		

	}

}

