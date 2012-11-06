
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the client_non_authentifie database table.
 * 
 */
@Entity
@Table(name="client_non_authentifie")
public class ClientNonAuthentifie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String login;

    public ClientNonAuthentifie() {
    }

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}