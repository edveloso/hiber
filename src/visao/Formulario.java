package visao;

import modelo.HibernateUtil;
import modelo.Produto;

import org.hibernate.Session;

public class Formulario {


	public static void main(String[] args) {
		
	//Classe que pega as configuração do arquivo de 
	//	hibernate.cfg.xml e instancia o objeto 
		// sessionFactory
	
	Session session =  HibernateUtil.getSession();
	
	Produto produto = new Produto();
	produto.setDescricao("acucar importado da groelandia");
	produto.setNome("Acucar");
	
	session.beginTransaction();
	session.save(produto);
	session.getTransaction().commit();
		
	}


}








