package tn.com.isamm.projet.banque.serviceImpl;

import java.util.List;

import tn.com.isamm.projet.banque.dao.ClientDao;
import tn.com.isamm.projet.banque.model.Client;
import tn.com.isamm.projet.banque.service.ClientService;


public class ClientServiceImpl implements ClientService {
	
	ClientDao clientDaoJpa;

	public ClientDao getClientDaoJpa() {
		return clientDaoJpa;
	}

	public void setClientDaoJpa(ClientDao clientDaoJpa) {
		this.clientDaoJpa = clientDaoJpa;
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



}
