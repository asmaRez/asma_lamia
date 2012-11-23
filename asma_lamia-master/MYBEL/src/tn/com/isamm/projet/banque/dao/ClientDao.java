package tn.com.isamm.projet.banque.dao;

import java.util.List;

import tn.com.isamm.projet.banque.model.Client;

public interface ClientDao {
	
    public List<Client> consulterClient();
    public Client getClient(int id);


}
