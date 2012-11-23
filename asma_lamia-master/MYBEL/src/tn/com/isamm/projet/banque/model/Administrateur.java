package tn.com.isamm.projet.banque.model;

import java.io.Serializable;
import javax.persistence.*;


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

	private int pwd;

	//bi-directional one-to-one association to ChargeClientele
	@OneToOne(mappedBy="administrateur")
	private ChargeClientele chargeClientele;

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

	public int getPwd() {
		return this.pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}

	public ChargeClientele getChargeClientele() {
		return this.chargeClientele;
	}

	public void setChargeClientele(ChargeClientele chargeClientele) {
		this.chargeClientele = chargeClientele;
	}
	
}