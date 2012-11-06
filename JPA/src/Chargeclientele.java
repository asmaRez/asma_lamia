
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chargeclientele database table.
 * 
 */
@Entity
@Table(name="chargeclientele")
public class Chargeclientele implements Serializable {
	private static final long serialVersionUID = 1L;

	private String login;

	private int pwd;

    public Chargeclientele() {
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

}