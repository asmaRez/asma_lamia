package tn.com.isamm.projet.banque.main;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


import tn.com.isamm.projet.banque.model.Administrateur;
import tn.com.isamm.projet.banque.model.ChargeClientele;
import tn.com.isamm.projet.banque.model.Client;
import tn.com.isamm.projet.banque.model.Pret;
import tn.com.isamm.projet.banque.service.AdministrateurService;
import tn.com.isamm.projet.banque.service.ChargeClienteleService;
import tn.com.isamm.projet.banque.service.ClientService;

public class Test {

	ClientService clientService;
	ChargeClienteleService chargeService;
	AdministrateurService adminService;
	
	public ChargeClienteleService getChargeService() {
		return chargeService;
	}
	public void setChargeService(ChargeClienteleService chargeService) {
		this.chargeService = chargeService;
	}
	public ClientService getClientService() {
		return clientService;
	}
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}	
	public AdministrateurService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdministrateurService adminService) {
		this.adminService = adminService;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Test test= new Test();
		test.ajouterClient(0, "091456123", "Zouaghi", "lamia", "20712172", "zz@gmail.com", "lamia", 123);
*/
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");
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
		em.getTransaction().commit();
		
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


	public void ajouterClient(int id,int cin, String nom, String prenom, String tel,
			String mail, String login, String pwd) {
		Client client = new Client();
		client.setCin(cin);
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setTelephone(tel);
		client.setMail(mail);
		client.setLogin(login);
		client.setPwd(pwd);
		clientService.ajouterClient(client);
	}
	
	 public void ajouterCharge(String matricule,String mail) {
			ChargeClientele charge = new ChargeClientele();
			charge.setMatricule(matricule);
			charge.setMail(mail);
			chargeService.ajouterCharge(charge);
		}
}
