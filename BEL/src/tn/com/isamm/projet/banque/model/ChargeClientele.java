package tn.com.isamm.projet.banque.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the charge_clientele database table.
 * 
 */
@Entity
@Table(name="charge_clientele")
public class ChargeClientele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_charge")
	private int idCharge;

	private String mail;

	private String matricule;

	//bi-directional many-to-one association to Administrateur
    @ManyToOne
	@JoinColumn(name="id_admin")
	private Administrateur administrateur;

	//bi-directional many-to-one association to Client
	@OneToMany(mappedBy="chargeClientele")
	private Set<Client> clients;

    public ChargeClientele() {
    }

	public int getIdCharge() {
		return this.idCharge;
	}

	public void setIdCharge(int idCharge) {
		this.idCharge = idCharge;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Administrateur getAdministrateur() {
		return this.administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	
	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
}