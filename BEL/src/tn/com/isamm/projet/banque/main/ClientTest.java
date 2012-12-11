package tn.com.isamm.projet.banque.main;

import java.util.Date;
import java.util.Iterator;
import java.util.List;


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

public class ClientTest {

	static ClientDaoJpa clDao = new ClientDaoJpa();
	static CreditDaoJpa creditDao = new CreditDaoJpa();

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientTest test = new ClientTest();
		int lower = 11111;
		int higher = 99999;

		int random = (int)(Math.random() * (higher-lower)) + lower;
		
		test.ajouterClient(926542,"wergui","jihen","547855","jihen@gmail.com","hgh","ffg",random);
		//test.supprimerClient(2);

	}

	public void supprimerClient(int id){
		
		clDao.em = emf.createEntityManager();
		
		Client client = clDao.em.find(Client.class, id);
		if (client == null)		    
		      throw new IllegalArgumentException("Suppression impossible. Ce client n'existe pas.");		  
		else 
		{
			clDao.supprimerClient(client);
		}
	}

	public void ajouterClient(int cin, String nom, String prenom, String tel,
			String mail, String login, String pwd, int num_compte) {

		clDao.em = emf.createEntityManager();
		Client client = new Client();
		client.setCin(cin);
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setTelephone(tel);
		client.setMail(mail);
		client.setLogin(login);
		client.setPwd(pwd);
		client.setNum_compte(num_compte);
		ChargeClientele charge = getCharge(2);
		client.setChargeClientele(charge);
		clDao.ajouterClient(client);
	}
	
	public ChargeClientele getCharge(int ident){
		Query query = clDao.em.createNativeQuery("select * from charge_clientele a where a.id_charge = ?"+ident);
		query.setParameter(ident, ident);
		
		  List results = query.getResultList( ); 
		  Iterator it = results.iterator( );

	       ChargeClientele charge = new ChargeClientele();

	       while (it.hasNext( )) {

		       Object[] result = (Object[])it.next();

		       int id =(Integer) result[0]; 
		       String matricule =(String) result[2]; 
		       String mail1 =(String) result[3]; 

		       charge.setIdCharge(id);
		       charge.setMail(mail1);
		       charge.setMatricule(matricule);
		       
		    }
			return charge;
	}
	
	public void avoirCompte() {

		creditDao.em = emf.createEntityManager();
		Credit credit = new Credit();
		//credit.setRib(rib);

		creditDao.ajouterCredit(credit);
	}

}
