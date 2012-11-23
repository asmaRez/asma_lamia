package tn.com.isamm.projet.banque.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the administrateur database table.
 * 
 */
@Entity
@Table(name="administrateur")
public class Administrateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_admin")
	private int idAdmin;

	private String login;

	private String pwd;

	//bi-directional many-to-one association to ChargeClientele
	@OneToMany(mappedBy="administrateur")
	private Set<ChargeClientele> chargeClienteles;

    public Administrateur() {
    }

	public int getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Set<ChargeClientele> getChargeClienteles() {
		return this.chargeClienteles;
	}

	public void setChargeClienteles(Set<ChargeClientele> chargeClienteles) {
		this.chargeClienteles = chargeClienteles;
	}
	
}