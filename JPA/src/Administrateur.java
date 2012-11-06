
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

	private int pwd;

	//bi-directional many-to-one association to Personnel
    @ManyToOne
	@JoinColumn(name="login")
	private Personnel personnel;

    public Administrateur() {
    }

	public int getPwd() {
		return this.pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public Personnel getPersonnel() {
		return this.personnel;
	}

	public void setPersonnel(Personnel personnel) {
		this.personnel = personnel;
	}
	
}