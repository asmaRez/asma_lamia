package tn.com.isamm.projet.banque.dao;

import java.util.List;

import tn.com.isamm.projet.banque.model.Client;

public interface ClientDao {
	
    public List<Client> consulterClient();
    public Client getClient(int id);
	public void ajouterClient(Client client);
	public void supprimerClient(Client client);


}
