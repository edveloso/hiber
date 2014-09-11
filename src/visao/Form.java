package visao;

import modelo.Produto;
import modelo.persistencia.ProdutoDAO;

public class Form {

	/**
	 * @param args
	 * 
	 *
	 * 
	 */
	public static void main(String[] args) {
		//Criar 
		
		
		ProdutoDAO dao = new ProdutoDAO();
		
		Produto prod1 = new Produto();
		prod1.setNome("iPhone6");
		prod1.setDescricao("mais do mesmo");

		dao.salvar(prod1);
		
		Produto prod2 = new Produto();
		prod2.setNome("iPhone6+");
		prod2.setDescricao("não dá para segurar na mão");

		dao.salvar(prod2);
		
	for(Produto prod : dao.listaTodos()){
		System.out.print(prod.getNome());
		System.out.println(" - "+prod.getDescricao());
	}
	
	  
	Produto prodDelete = dao.getProduto(6);
	dao.apagar(prodDelete);
	

	Produto prodAlterar = dao.getProduto(7);
	prodAlterar.setDescricao("é uma merda");
	dao.atualizar(prodAlterar);
	
	
	}

}



