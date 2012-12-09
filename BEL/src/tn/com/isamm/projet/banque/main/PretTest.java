package tn.com.isamm.projet.banque.main;

import java.util.Iterator;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;

import tn.com.isamm.projet.banque.dao.PretDao;
import tn.com.isamm.projet.banque.dao.JPA.AdministrateurDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.ChargeClienteleDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.ClientDaoJpa;
import tn.com.isamm.projet.banque.dao.JPA.DaoManagerJPA;
import tn.com.isamm.projet.banque.dao.JPA.PretDaoJpa;

import tn.com.isamm.projet.banque.model.ChargeClientele;
import tn.com.isamm.projet.banque.model.Client;
import tn.com.isamm.projet.banque.model.Pret;

public class PretTest {

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
		
		PretDaoJpa pretDao = new PretDaoJpa();
		pretDao.em = emf.createEntityManager();

		Pret pret = new Pret();
		pret.setMontant(1000);
		pret.setSalaire(1200);
		pret.setDuree(20);
		
		Query query = pretDao.em.createNativeQuery("select * from client a where a.id_client = ?1");
		query.setParameter(1, 1);
		
		  List results = query.getResultList( ); 
		  Iterator it = results.iterator( );

		    while (it.hasNext( )) {

		       Object[] result = (Object[])it.next();

		       int id =(Integer) result[0]; 
		       String nom =(String) result[2]; 
		       String prenom =(String) result[3]; 
		       int cin =(Integer) result[4]; 
		       String tel =(String) result[5]; 
		       String mail =(String) result[6]; 
		       String login =(String) result[7]; 
		       String pwd =(String) result[8]; 

		       Client client = new Client();
		       client.setIdClient(id);
		       client.setNom(nom);
		       client.setPrenom(prenom);
		       client.setCin(cin);
		       client.setTelephone(tel);
		       client.setMail(mail);
		       client.setLogin(login);
		       client.setPwd(pwd);
		       
		       pret.setClient(client);
		    }
		
			pretDao.ajouterPret(pret);
	}
}
