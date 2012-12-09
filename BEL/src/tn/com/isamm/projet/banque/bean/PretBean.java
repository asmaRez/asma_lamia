package tn.com.isamm.projet.banque.bean;

import java.util.Iterator;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import tn.com.isamm.projet.banque.dao.JPA.ChargeClienteleDaoJpa;
import tn.com.isamm.projet.banque.model.*;

@ManagedBean
@RequestScoped
public class PretBean {
	
public String ajouterPret(){
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");
	EntityManager em = emf.createEntityManager();
	
	
	Pret pret = new Pret();
	pret.setMontant(5000);
	pret.setSalaire(1200);
	pret.setDuree(10);
	
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
	
	return "validationPret";
}


}
