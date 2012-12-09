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

import tn.com.isamm.projet.banque.model.ChargeClientele;
import tn.com.isamm.projet.banque.model.Client;

public class ClientTest {

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
		
		ClientDaoJpa clDao = new ClientDaoJpa();
		clDao.em = emf.createEntityManager();
		Client client = new Client();
		client.setCin(9123456);
		client.setNom("Zouaghi");
		client.setPrenom( "lamia");
		client.setTelephone("20712172");
		client.setMail("zz@gmail.com");
		client.setLogin("lamia");
		client.setPwd("123");
		
		Query query = clDao.em.createNativeQuery("select * from charge_clientele a where a.id_charge = ?1");
		query.setParameter(1, 1);
		
		  List results = query.getResultList( ); 
		  Iterator it = results.iterator( );

		    while (it.hasNext( )) {

		       Object[] result = (Object[])it.next();

		       int id =(Integer) result[0]; 
		       String matricule =(String) result[2]; 
		       String mail =(String) result[3]; 
		       ChargeClientele charge = new ChargeClientele();
		       charge.setIdCharge(id);
		       charge.setMail(mail);
		       charge.setMatricule(matricule);
		       client.setChargeClientele(charge);
		    }
		clDao.ajouterClient(client);
		
		
		
	}


/*	public void ajouterClient(int cin, String nom, String prenom, String tel,
			String mail, String login, String pwd) {
		//EntityManager em = manager.getEntityManager();
		
		ChargeClientele charge = getCharge();
		ClientDaoJpa clDao = new ClientDaoJpa();
		clDao.em = emf.createEntityManager();
		Client client = new Client();
		client.setCin(9123456);
		client.setNom("Zouaghi");
		client.setPrenom( "lamia");
		client.setTelephone("20712172");
		client.setMail("zz@gmail.com");
		client.setLogin("lamia");
		client.setPwd("123");
		client.setChargeClientele(charge);
		clientDao.ajouterClient(client);
		
	}
	
	
	public ChargeClientele getCharge(){
		Query query = clientDao.em.createNativeQuery("select * from charge_clientele a where a.id_charge = ?1");
		query.setParameter(1, 1);
		
		  List results = query.getResultList( ); 
		  Iterator it = results.iterator( );
		  ChargeClientele charge = new ChargeClientele();
		    while (it.hasNext( )) {

		       Object[] result = (Object[])it.next();

		       int id =(Integer) result[0]; 
		       String matricule =(String) result[2]; 
		       String mail =(String) result[3]; 
		      
		       charge.setIdCharge(id);
		       charge.setMail(mail);
		       charge.setMatricule(matricule);
		       
		    }
		return charge;
		
	}*/
	
	
}
