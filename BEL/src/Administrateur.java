
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the administrateur database table.
 * 
 */
@Entity
@Table(name="administrateur")
public class Administrateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pers")
	private int idPers;

	private String login;

	private int pwd;

	//bi-directional one-to-one association to Authentification
	@OneToOne
	@JoinColumn(name="id_pers")
	private Authentification authentification;

	//bi-directional one-to-one association to ChargeClientele
	@OneToOne(mappedBy="administrateur")
	private ChargeClientele chargeClientele;

    public Administrateur() {
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

	public int getPwd() {
		return this.pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public Authentification getAuthentification() {
		return this.authentification;
	}

	public void setAuthentification(Authentification authentification) {
		this.authentification = authentification;
	}
	
	public ChargeClientele getChargeClientele() {
		return this.chargeClientele;
	}

	public void setChargeClientele(ChargeClientele chargeClientele) {
		this.chargeClientele = chargeClientele;
	}
	
}