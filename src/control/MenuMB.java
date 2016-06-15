package control;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class MenuMB implements Serializable {
	private static final long serialVersionUID = -9155445898613815732L;
	
		
	public String autor() { 
		String pagina = "autor?faces-redirect=true";
		return pagina;
	}
	
	public String editora() { 
		String pagina = "editora?faces-redirect=true";
		return pagina;
	}
	
	public String categoria() { 
		String pagina = "categoria?faces-redirect=true";
		return pagina;
	}
	
	public String livro() { 
		String pagina = "livro?faces-redirect=true";
		return pagina;
	}
	
	
}
