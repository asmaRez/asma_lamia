package tn.com.isamm.projet.banque.serviceImpl;

import java.util.List;

import tn.com.isamm.projet.banque.dao.ChargeClienteleDao;
import tn.com.isamm.projet.banque.dao.JPA.ChargeClienteleDaoJpa;
import tn.com.isamm.projet.banque.model.*;
import tn.com.isamm.projet.banque.service.ChargeClienteleService;



public class ChargeClienteleServiceImpl implements ChargeClienteleService {
	
	ChargeClienteleDaoJpa chargeDaoJpa;
ChargeClientele charge;
	Administrateur administrateur;

	@Override
	public void ajouterCharge(String matricule, String mail) throws Exception {
		// TODO Auto-generated method stub
		administrateur = new Administrateur();
		ChargeClientele charge = new ChargeClientele();
		charge.setMatricule(matricule);
		charge.setMail(mail);
		charge.setAdministrateur(administrateur);
		chargeDaoJpa.createObject(charge);
			}


	@Override
	public List<ChargeClientele> consulterCherge() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ChargeClientele getCharge(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void activerCompte(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ajouterCharge(ChargeClientele charge) {
		// TODO Auto-generated method stub
		
	}



}
