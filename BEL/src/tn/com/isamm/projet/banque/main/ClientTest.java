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
		
		
		
		
		
		
		
		
		//test.ajouterClient( 91456123, "Rezgui", "asma", "20712172", "zz@gmail.com", "lamia", "123");

		
	
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");
		EntityManager em = emf.createEntityManager();
		

		Pret pret = new Pret();
		pret.setMontant(1000);
		pret.setSalaire(1200);
		pret.setDuree(20);
		
		Query query = em.createNativeQuery("select * from client a where a.id_client = ?1");
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
		
		em.getTransaction().begin();
		em.merge(pret);
		em.getTransaction().commit();*/
		
		/*Client client = new Client();
		client.setCin(9123456);
		client.setNom("Zouaghi");
		client.setPrenom( "lamia");
		client.setTelephone("20712172");
		client.setMail("zz@gmail.com");
		client.setLogin("lamia");
		client.setPwd("123");
		
		Query query = em.createNativeQuery("select * from charge_clientele a where a.id_charge = ?1");
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
		
		em.getTransaction().begin();
		em.merge(client);
		em.getTransaction().commit();*/
		
		/*ChargeClientele charge = new ChargeClientele();
		charge.setMatricule("123456");
		charge.setMail("aaa@gmail.com");
		
		Query query = em.createNativeQuery("select * from Administrateur a where a.id_admin = ?1");
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
		
		em.getTransaction().begin();
		em.merge(charge);
		em.getTransaction().commit();
		*/
		
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
	
	/* public void ajouterCharge(String matricule,String mail) {
			ChargeClientele charge = new ChargeClientele();
			charge.setMatricule(matricule);
			charge.setMail(mail);
			chargeDao.ajouterCharge(charge);
		}*/
}
