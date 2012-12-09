package tn.com.isamm.projet.banque.main;

import java.util.Iterator;
import java.util.List;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

import tn.com.isamm.projet.banque.dao.JPA.AdministrateurDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.ChargeClienteleDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.ClientDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.DaoManagerJPA;

import tn.com.isamm.projet.banque.model.Administrateur;
import tn.com.isamm.projet.banque.model.ChargeClientele;
import tn.com.isamm.projet.banque.model.Client;

public class ChargeTest {

	ClientDaoJpa clientDao;
	ChargeClienteleDaoJpa chargeDao;
	AdministrateurDaoJpa adminDao;
	@SuppressWarnings("rawtypes")
	DaoManagerJPA manager;
	

	public ClientDaoJpa getClientDao() {
		return clientDao;
	}


	public void setClientDao(ClientDaoJpa clientDao) {
		this.clientDao = clientDao;
	}


	public ChargeClienteleDaoJpa getChargeDao() {
		return chargeDao;
	}


	public void setChargeDao(ChargeClienteleDaoJpa chargeDao) {
		this.chargeDao = chargeDao;
	}


	public AdministrateurDaoJpa getAdminDao() {
		return adminDao;
	}


	public void setAdminDao(AdministrateurDaoJpa adminDao) {
		this.adminDao = adminDao;
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");
		
		ChargeClienteleDaoJpa chargeDao = new ChargeClienteleDaoJpa();
		chargeDao.em = emf.createEntityManager();
		ChargeClientele charge = new ChargeClientele();
		charge.setMatricule("123456");
		charge.setMail("aaa@gmail.com");
		
		Query query = chargeDao.em.createNativeQuery("select * from Administrateur a where a.id_admin = ?1");
		query.setParameter(1, 1);
		
		  List results = query.getResultList( ); 
		  Iterator it = results.iterator( );

		    while (it.hasNext( )) {

		       Object[] result = (Object[])it.next();

		       int id =(Integer) result[0]; 
		       String login =(String) result[1]; 
		       String pwd =(String) result[2]; 
		       Administrateur admin = new Administrateur();
		       admin.setIdAdmin(id);
		       admin.setLogin(login);
		       admin.setPwd(pwd);
		       charge.setAdministrateur(admin);
		    }
		
		
		chargeDao.ajouterCharge(charge);
		
		
		
		
		
	}

}
