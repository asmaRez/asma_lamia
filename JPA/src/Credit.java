
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the credit database table.
 * 
 */
@Entity
@Table(name="credit")
public class Credit implements Serializable {
	private static final long serialVersionUID = 1L;

	private int duree;

	private int montant;

	private int numcompe;

	private int salaire;

	private String type;

    public Credit() {
    }

	public int getDuree() {
		return this.duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getMontant() {
		return this.montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public int getNumcompe() {
		return this.numcompe;
	}

	public void setNumcompe(int numcompe) {
		this.numcompe = numcompe;
	}

	public int getSalaire() {
		return this.salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}