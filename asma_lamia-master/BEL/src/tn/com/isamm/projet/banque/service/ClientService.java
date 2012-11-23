package tn.com.isamm.projet.banque.service;

import java.util.List;

import tn.com.isamm.projet.banque.model.Client;

public interface ClientService {
	
    public List<Client> consulterClient();
    public Client getClient(int id);
    public void ajouterClient(int id,int cin, String nom, String prenom, String tel,
			String mail, String login, String pwd);
    public void ajouterClient(Client client);

}
