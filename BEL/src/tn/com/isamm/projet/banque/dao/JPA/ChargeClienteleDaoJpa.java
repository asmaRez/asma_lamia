package tn.com.isamm.projet.banque.dao.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tn.com.isamm.projet.banque.dao.ChargeClienteleDao;
import tn.com.isamm.projet.banque.model.Administrateur;
import tn.com.isamm.projet.banque.model.ChargeClientele;
import tn.com.isamm.projet.banque.model.Client;



public class ChargeClienteleDaoJpa extends DaoManagerJPA<ChargeClientele>  {


	public static EntityManager em;
	
	public void ajouterCharge(ChargeClientele charge) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.merge(charge);
		em.getTransaction().commit();
		
	}


}
