package br.com.impacta.teste;

import java.util.Calendar;
import java.util.Date;

import br.com.impacta.bean.PessoaBean;
import br.com.impacta.conexao.ConexaoFactory;

public class Teste {

	public static void main(String[] args) {
		
//	ConexaoFactory cf = new ConexaoFactory();
//	
//	cf.getConexao();
		
		//Instanciar pessoa
		PessoaBean pesssoaBean;
		
		//Construi o objeto
			pesssoaBean = new PessoaBean();
			
			pesssoaBean.setNome("juca");
			Date dtNasc = new Date();
			dtNasc.setTime(Calendar.getInstance().getTimeInMillis());
			pesssoaBean.setDtNsac(dtNasc);
			
			System.out.print(pesssoaBean.getNome());
		

	}

}

