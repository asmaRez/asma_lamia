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
	private int numero;

    @Temporal( TemporalType.DATE)
	private Date date;

	private int montant;

	private String rib;


    public Credit() {
    }

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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


}