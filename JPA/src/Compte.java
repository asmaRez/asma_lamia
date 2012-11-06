
import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the compte database table.
 * 
 */
@Entity
@Table(name="compte")
public class Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String rib;

	//bi-directional many-to-one association to CompteCourant
	@OneToMany(mappedBy="compte")
	private Set<CompteCourant> compteCourants;

	//bi-directional many-to-one association to CompteEpargne
	@OneToMany(mappedBy="compte")
	private Set<CompteEpargne> compteEpargnes;

	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="compte")
	private Set<Transaction> transactions;

    public Compte() {
    }

	public String getRib() {
		return this.rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public Set<CompteCourant> getCompteCourants() {
		return this.compteCourants;
	}

	public void setCompteCourants(Set<CompteCourant> compteCourants) {
		this.compteCourants = compteCourants;
	}
	
	public Set<CompteEpargne> getCompteEpargnes() {
		return this.compteEpargnes;
	}

	public void setCompteEpargnes(Set<CompteEpargne> compteEpargnes) {
		this.compteEpargnes = compteEpargnes;
	}
	
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}
	
}