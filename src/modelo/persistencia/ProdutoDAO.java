package modelo.persistencia;

import java.util.List;

import org.hibernate.Session;

import modelo.HibernateUtil;
import modelo.Produto;

//CRUD
public class ProdutoDAO {

	private Session session;
	
	public ProdutoDAO(){
		session = HibernateUtil.getSession();
	}
	
	//c - create
	public void salvar(Produto produto){
		session.beginTransaction();
		session.save(produto);
		session.getTransaction().commit();
	}
	
	//r - 2 - (ler 1 - ler todos)
public Produto getProduto(Integer codigo){
  return (Produto) session.get(Produto.class, codigo);
}
	
public List<Produto> listaTodos(){
  return session.createCriteria(Produto.class).list();
}
	
	//u - atualizar
	public void atualizar(Produto produto){
		session.beginTransaction();
		session.update(produto);
		session.getTransaction().commit();
	}
	
	//d - deletar
	public void apagar(Produto produto){
		session.beginTransaction();
		session.delete(produto);
		session.getTransaction().commit();
	}
	
	
	
	
	
	
	
	
	
}
