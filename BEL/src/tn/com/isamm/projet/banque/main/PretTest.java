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

	static PretDaoJpa pretDao = new PretDaoJpa();

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PretTest test = new PretTest();
		
		test.ajouterPret(5000, 1200, 10);
		//test.supprimerPret(5);
	}
	
	public void supprimerPret(int id){
		
		pretDao.em = emf.createEntityManager();
		
		Pret pret = pretDao.em.find(Pret.class, id);
		if (pret == null)		    
		      throw new IllegalArgumentException("Suppression impossible. Ce pret n'existe pas.");		  
		else 
		{
			pretDao.supprimerPret(pret);
		}
	}
	
	public void ajouterPret(int montant,int salaire, int duree ) {

		pretDao.em = emf.createEntityManager();

		Pret pret = new Pret();
		pret.setMontant(montant);
		pret.setSalaire(salaire);
		pret.setDuree(duree);
		
		Client client = getClient(2);
		pret.setClient(client);
		pretDao.ajouterPret(pret);
	}
	
	public Client getClient(int ident){
		Query query = pretDao.em.createNativeQuery("select * from client a where a.id_client = ?1");
		query.setParameter(1, 1);
		
		  List results = query.getResultList( ); 
		  Iterator it = results.iterator( );

	       Client client = new Client();
	       
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

		       client.setIdClient(id);
		       client.setNom(nom);
		       client.setPrenom(prenom);
		       client.setCin(cin);
		       client.setTelephone(tel);
		       client.setMail(mail);
		       client.setLogin(login);
		       client.setPwd(pwd);
		    }
			return client;
	}

}
