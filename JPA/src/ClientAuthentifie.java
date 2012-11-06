
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the client_authentifie database table.
 * 
 */
@Entity
@Table(name="client_authentifie")
public class ClientAuthentifie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String login;

	private int numcompte;

    public ClientAuthentifie() {
    }

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getNumcompte() {
		return this.numcompte;
	}

	public void setNumcompte(int numcompte) {
		this.numcompte = numcompte;
	}

}