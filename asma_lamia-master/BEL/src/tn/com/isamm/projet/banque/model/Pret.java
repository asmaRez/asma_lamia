package tn.com.isamm.projet.banque.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pret database table.
 * 
 */
@Entity
@Table(name="pret")
public class Pret implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_credit")
	private int idCredit;

	private int duree;

	private int montant;

	private int salaire;

	private String typecredit;

	//bi-directional many-to-one association to Client
    @ManyToOne
	@JoinColumn(name="id_client")
	private Client client;

    public Pret() {
    }

	public int getIdCredit() {
		return this.idCredit;
	}

	public void setIdCredit(int idCredit) {
		this.idCredit = idCredit;
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

	public int getSalaire() {
		return this.salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public String getTypecredit() {
		return this.typecredit;
	}

	public void setTypecredit(String typecredit) {
		this.typecredit = typecredit;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}