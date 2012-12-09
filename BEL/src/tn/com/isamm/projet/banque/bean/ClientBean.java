package tn.com.isamm.projet.banque.bean;

import tn.com.isamm.projet.banque.dao.AdministrateurDao;
import tn.com.isamm.projet.banque.dao.ChargeClienteleDao;
import tn.com.isamm.projet.banque.dao.JPA.ChargeClienteleDaoJpa;
import tn.com.isamm.projet.banque.model.*;
public class ClientBean {
	private String matricule;
	private String mail;
	private ChargeClientele charge;
	
	private AdministrateurDao adminDao;
	private ChargeClienteleDao chargeDao;
	
	private Administrateur administrateur;
	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	private Integer idAdmin;
	
	 public ClientBean(){
		 
	 }
	
public ChargeClientele getCharge() {
		return charge;
	}

	public void setCharge(ChargeClientele charge) {
		this.charge = charge;
	}

	public Integer getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}

	
public String ajouterCharge(){
	charge.setMatricule(matricule);
	charge.setMail(mail);
	//Administrateur administrateur;
	//administrateur=adminDao.getAdmin(idAdmin);
	charge.setAdministrateur(administrateur);
	chargeDao.ajouterCharge(charge);
	return "hello";
}
public String getMatricule() {
	return matricule;
}
public void setMatricule(String matricule) {
	this.matricule = matricule;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}	

}
