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

	ClientDaoJpa clDao = new ClientDaoJpa();
	ClientDaoJpa clientDao;

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ClientTest test = new ClientTest();
		test.ajouterClient(92654,"lll","ggg","547855","fddff","hgh","ffg");
		
	}

	

	public void ajouterClient(int cin, String nom, String prenom, String tel,
			String mail, String login, String pwd) {
		

		clDao.em = emf.createEntityManager();
		Client client = new Client();
		client.setCin(cin);
		client.setNom(nom);
		client.setPrenom(prenom);
		client.setTelephone(tel);
		client.setMail(mail);
		client.setLogin(login);
		client.setPwd(pwd);
		
		ChargeClientele charge = getClient(2);
		client.setChargeClientele(charge);
		clDao.ajouterClient(client);
		
	}
	
	public ChargeClientele getClient(int ident){
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

}
