package br.com.teste.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.teste.dao.ProdutoDAO;
import br.com.teste.entity.Produto;


@ManagedBean
public class PesquisaProdutosBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public PesquisaProdutosBean() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		this.produtos = produtoDAO.findAll();
	}
	
	public void excluir() {
	}
	
	public void pesquisar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		this.produtos = produtoDAO.findAll();
	}
	
	public List<Produto> getProdutosFiltrados() {
		return produtos;
	}
	
}