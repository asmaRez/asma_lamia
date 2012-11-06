
import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the personnel database table.
 * 
 */
@Entity
@Table(name="personnel")
public class Personnel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String login;

	private int cin;

	private String mail;

	private String nom;

	private String prenom;

	private String pwd;

	private String tel;

	//bi-directional many-to-one association to Administrateur
	@OneToMany(mappedBy="personnel")
	private Set<Administrateur> administrateurs;

	//bi-directional many-to-one association to Client
	@OneToMany(mappedBy="personnel")
	private Set<Client> clients;

    public Personnel() {
    }

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Set<Administrateur> getAdministrateurs() {
		return this.administrateurs;
	}

	public void setAdministrateurs(Set<Administrateur> administrateurs) {
		this.administrateurs = administrateurs;
	}
	
	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
}