
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the compte_epargne database table.
 * 
 */
@Entity
@Table(name="compte_epargne")
public class CompteEpargne implements Serializable {
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Compte
    @ManyToOne
	@JoinColumn(name="rib")
	private Compte compte;

    public CompteEpargne() {
    }

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
}