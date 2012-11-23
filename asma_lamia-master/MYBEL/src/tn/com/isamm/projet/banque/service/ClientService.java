package tn.com.isamm.projet.banque.service;

import java.util.List;

import tn.com.isamm.projet.banque.model.Client;

public interface ClientService {
	
    public List<Client> consulterClient();
    public Client getClient(int id);


}
