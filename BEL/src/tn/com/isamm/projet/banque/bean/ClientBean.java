package tn.com.isamm.projet.banque.bean;

import tn.com.isamm.projet.banque.dao.JPA.ChargeClienteleDaoJpa;
import tn.com.isamm.projet.banque.service.*;
import tn.com.isamm.projet.banque.model.*;
public class ClientBean {
	private String matricule;
	private String mail;
	private ChargeClientele charge;
	private Administrateur administrateur;
	public Administrateur getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}
	private Integer idAdmin;
	
	 ChargeClienteleService chargeService;
	 AdministrateurService adminService;
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

	public ChargeClienteleService getChargeService() {
		return chargeService;
	}

	public void setChargeService(ChargeClienteleService chargeService) {
		this.chargeService = chargeService;
	}

	public AdministrateurService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdministrateurService adminService) {
		this.adminService = adminService;
	}

public String ajouterCharge(){
	charge.setMatricule(matricule);
	charge.setMail(mail);
	//Administrateur administrateur;
	administrateur=adminService.getAdmin(idAdmin);
	charge.setAdministrateur(administrateur);
	chargeService.ajouterCharge(charge);
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
