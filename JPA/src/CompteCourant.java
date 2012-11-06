
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the compte_courant database table.
 * 
 */
@Entity
@Table(name="compte_courant")
public class CompteCourant implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Compte
    @ManyToOne
	@JoinColumn(name="rib")
	private Compte compte;

    public CompteCourant() {
    }

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
}