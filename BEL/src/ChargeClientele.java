
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the charge_clientele database table.
 * 
 */
@Entity
@Table(name="charge_clientele")
public class ChargeClientele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pers")
	private int idPers;

	private String mail;

	private String matricule;

	//bi-directional one-to-one association to Administrateur
	@OneToOne
	@JoinColumn(name="id_pers")
	private Administrateur administrateur;

    public ChargeClientele() {
    }

	public int getIdPers() {
		return this.idPers;
	}

	public void setIdPers(int idPers) {
		this.idPers = idPers;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Administrateur getAdministrateur() {
		return this.administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	
}