
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the debit database table.
 * 
 */
@Entity
@Table(name="debit")
public class Debit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int num;

    @Temporal( TemporalType.DATE)
	private Date date;

	private int montant;

	private String rib;

	private String typetrans;

    public Debit() {
    }

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getMontant() {
		return this.montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public String getRib() {
		return this.rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public String getTypetrans() {
		return this.typetrans;
	}

	public void setTypetrans(String typetrans) {
		this.typetrans = typetrans;
	}

}