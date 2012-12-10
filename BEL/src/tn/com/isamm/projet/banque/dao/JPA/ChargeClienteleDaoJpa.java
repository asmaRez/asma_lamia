package tn.com.isamm.projet.banque.dao.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tn.com.isamm.projet.banque.dao.ChargeClienteleDao;
import tn.com.isamm.projet.banque.dao.ClientDao;
import tn.com.isamm.projet.banque.model.Administrateur;
import tn.com.isamm.projet.banque.model.ChargeClientele;
import tn.com.isamm.projet.banque.model.Client;



public class ChargeClienteleDaoJpa implements ChargeClienteleDao  {

	public static EntityManager em;
	
	public static EntityManager getEm() {
		return em;
	}

	public static void setEm(EntityManager em) {
		ClientDaoJpa.em = em;
	}

	
	public void ajouterCharge(ChargeClientele charge) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.persist(charge);
		em.getTransaction().commit();
	
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

	public void supprimerCharge(ChargeClientele charge) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(charge);
		em.getTransaction().commit();
	}


}
