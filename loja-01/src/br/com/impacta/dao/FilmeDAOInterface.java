package br.com.impacta.dao;
import java.util.List;
import br.com.impacta.bean.FilmeBEAN;

public interface FilmeDAOInterface {
	
	public List<FilmeBEAN> select();
	
	public FilmeBEAN select(int id);
	
	public boolean delete(int id);
	
	public FilmeBEAN update(FilmeBEAN fb);
	
	public boolean insert(FilmeBEAN fb);


}
