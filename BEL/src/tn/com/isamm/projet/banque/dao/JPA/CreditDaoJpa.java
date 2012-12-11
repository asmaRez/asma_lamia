package tn.com.isamm.projet.banque.dao.JPA;

import javax.persistence.EntityManager;

import tn.com.isamm.projet.banque.dao.CreditDao;
import tn.com.isamm.projet.banque.model.Client;
import tn.com.isamm.projet.banque.model.Credit;


public class CreditDaoJpa implements CreditDao {

	public static EntityManager em;
	@Override
	public Client getCredit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterCredit(Credit credit) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.merge(credit);
		em.getTransaction().commit();
	}

	@Override
	public void supprimerCredit(Credit creit) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(creit);
		em.getTransaction().commit();
	}


}
