package br.com.teste.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

import br.com.teste.dao.ProdutoDAO;
import br.com.teste.entity.Produto;
import br.com.teste.util.cdi.JPAUtil;

@ManagedBean
@ViewScoped
public class CadastroProdutoBean {
	
	
	private Produto produto = new Produto();
	
//	@SuppressWarnings("unchecked")
//	@PostConstruct
//	public void init() {
//		EntityManager manager = getEntityManager();
//		manager.getTransaction().begin();
//		
//		
//		manager.getTransaction().commit();
//		manager.close();
//	}
	
	
	public void salvar() {

    	ProdutoDAO dao = new ProdutoDAO();
    	
    	dao.save(this.produto);
    	
    	String msg = "Cadastro efetuado com sucesso!";
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
    	
	}


	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	protected EntityManager getEntityManager() {
		return JPAUtil.getInstance().getEntityManager();
	}
	
}
