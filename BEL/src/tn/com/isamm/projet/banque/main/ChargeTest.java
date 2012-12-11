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

	static ChargeClienteleDaoJpa chargeDao = new ChargeClienteleDaoJpa();

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChargeTest test = new ChargeTest();
		
		test.ajouterCharge("14566", "aaa@gmail.com");
		//test.supprimerCharge(5);

	}
	
	public void supprimerCharge(int id){
		
		chargeDao.em = emf.createEntityManager();
		
		ChargeClientele charge = chargeDao.em.find(ChargeClientele.class, id);
		if (charge == null)		    
		      throw new IllegalArgumentException("Suppression impossible. Ce charge n'existe pas.");		  
		else 
		{
			chargeDao.supprimerCharge(charge);
		}
	}

	public void ajouterCharge( String matricule,String mail) {

		chargeDao.em = emf.createEntityManager();
		ChargeClientele charge = new ChargeClientele();
		charge.setMatricule(matricule);
		charge.setMail(mail);
		Administrateur admin = getAdmin(1);
		charge.setAdministrateur(admin);
		chargeDao.ajouterCharge(charge);
	}
	
	public Administrateur getAdmin(int ident){
		Query query = chargeDao.em.createNativeQuery("select * from Administrateur a where a.id_admin = ?"+ident);
		query.setParameter(ident, ident);
		
		  List results = query.getResultList( ); 
		  Iterator it = results.iterator( );
		  
	       Administrateur admin = new Administrateur();
		    while (it.hasNext( )) {

		       Object[] result = (Object[])it.next();

		       int id =(Integer) result[0]; 
		       String login =(String) result[1]; 
		       String pwd =(String) result[2]; 
		       admin.setIdAdmin(id);
		       admin.setLogin(login);
		       admin.setPwd(pwd);
		       
		    }
			return admin;
	}

}
