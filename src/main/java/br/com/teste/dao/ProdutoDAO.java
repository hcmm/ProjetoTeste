package br.com.teste.dao;

import br.com.teste.entity.Produto;

public class ProdutoDAO extends GenericDAO<Produto> {

	public ProdutoDAO() {
		super(Produto.class);
	}

}
