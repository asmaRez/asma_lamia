package tn.com.isamm.projet.banque.dao.JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import tn.com.isamm.projet.banque.dao.ClientDao;
import tn.com.isamm.projet.banque.model.Client;


public class ClientDaoJpa implements ClientDao {

	public static EntityManager em;
	
	public static EntityManager getEm() {
		return em;
	}

	public static void setEm(EntityManager em) {
		ClientDaoJpa.em = em;
	}

	@Override
	public List<Client> consulterClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client getClient(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterClient(Client client) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.merge(client);
		em.getTransaction().commit();
		
	}
	

	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		em.remove(client);
		em.getTransaction().commit();
	}



}
