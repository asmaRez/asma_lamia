package tn.com.isamm.projet.banque.dao.JPA;


import javax.persistence.EntityManager;

import tn.com.isamm.projet.banque.dao.PretDao;
import tn.com.isamm.projet.banque.model.Client;
import tn.com.isamm.projet.banque.model.Pret;

public class PretDaoJpa implements PretDao {
	public static EntityManager em;

	@Override
	public void ajouterPret(Pret pret) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.merge(pret);
		em.getTransaction().commit();
		
	}
}
