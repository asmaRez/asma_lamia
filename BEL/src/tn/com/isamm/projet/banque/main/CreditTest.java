package tn.com.isamm.projet.banque.main;

import java.util.Iterator;
import java.util.List;
import java.util.Date;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

import tn.com.isamm.projet.banque.dao.JPA.AdministrateurDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.ChargeClienteleDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.ClientDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.CreditDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.DaoManagerJPA;

import tn.com.isamm.projet.banque.model.ChargeClientele;
import tn.com.isamm.projet.banque.model.Client;
import tn.com.isamm.projet.banque.model.Credit;

public class CreditTest {

	static CreditDaoJpa creditDao = new CreditDaoJpa();

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");
	


	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditTest test = new CreditTest();
		
		//test.ajouterCredit("214568",1200,new Date("11/12/2012"));
		test.supprimerCredit(2);
		
		
	}

	public void supprimerCredit(int id){
		
		creditDao.em = emf.createEntityManager();
		
		Credit credit = creditDao.em.find(Credit.class, id);
		if (credit == null)		    
		      throw new IllegalArgumentException("Suppression impossible. Ce credit n'existe pas.");		  
		else 
		{
			creditDao.supprimerCredit(credit);
		}
	}

	public void ajouterCredit(String rib, int montant, Date date) {

		creditDao.em = emf.createEntityManager();
		Credit credit = new Credit();
		credit.setRib(rib);
		credit.setMontant(montant);
		credit.setDate(date);

		creditDao.ajouterCredit(credit);
	}
	
	
	

}
