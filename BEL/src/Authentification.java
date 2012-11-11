
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_auth")
	private int idAuth;

	private String login;

	private String pwd;

    public Authentification() {
    }

	public int getIdAuth() {
		return this.idAuth;
	}

	public void setIdAuth(int idAuth) {
		this.idAuth = idAuth;
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

}