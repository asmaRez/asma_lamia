package tn.com.isamm.projet.banque.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name="client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_client")
	private int idClient;

	private int cin;

	private String login;

	private String mail;

	private String nom;

	private String prenom;

	private String pwd;

	private String telephone;

	//bi-directional many-to-one association to ChargeClientele
    @ManyToOne
	@JoinColumn(name="id_charge")
	private ChargeClientele chargeClientele;

	//bi-directional many-to-one association to Pret
	@OneToMany(mappedBy="client")
	private Set<Pret> prets;

    public Client() {
    }

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getCin() {
		return this.cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public ChargeClientele getChargeClientele() {
		return this.chargeClientele;
	}

	public void setChargeClientele(ChargeClientele chargeClientele) {
		this.chargeClientele = chargeClientele;
	}
	
	public Set<Pret> getPrets() {
		return this.prets;
	}

	public void setPrets(Set<Pret> prets) {
		this.prets = prets;
	}
	
}