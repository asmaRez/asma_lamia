package tn.com.isamm.projet.banque.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the credit database table.
 * 
 */
@Entity
@Table(name="credit")
public class Credit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int num;

    @Temporal( TemporalType.DATE)
	private Date date;

	private int montant;

	private int numcompe;

	private String rib;

	private String typetrans;

	//bi-directional one-to-one association to Transaction
	@OneToOne
	@JoinColumn(name="num")
	private Transaction transaction;

    public Credit() {
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

	public int getNumcompe() {
		return this.numcompe;
	}

	public void setNumcompe(int numcompe) {
		this.numcompe = numcompe;
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

	public Transaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
}