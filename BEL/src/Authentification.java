
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the authentification database table.
 * 
 */
@Entity
@Table(name="authentification")
public class Authentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pers")
	private int idPers;

	private String login;

	private String pwd;

	//bi-directional one-to-one association to Administrateur
	@OneToOne(mappedBy="authentification")
	private Administrateur administrateur;

    public Authentification() {
    }

	public int getIdPers() {
		return this.idPers;
	}

	public void setIdPers(int idPers) {
		this.idPers = idPers;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Administrateur getAdministrateur() {
		return this.administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	
}