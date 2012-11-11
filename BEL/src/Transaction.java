
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the transaction database table.
 * 
 */
@Entity
@Table(name="transaction")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int num;

    @Temporal( TemporalType.DATE)
	private Date date;

	private int montant;

	private String rib;

	private String typetrans;

	//bi-directional one-to-one association to Credit
	@OneToOne(mappedBy="transaction")
	private Credit credit;

    public Transaction() {
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

	public Credit getCredit() {
		return this.credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}
	
}