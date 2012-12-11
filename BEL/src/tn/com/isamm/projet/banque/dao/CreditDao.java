package tn.com.isamm.projet.banque.dao;

import tn.com.isamm.projet.banque.model.Client;
import tn.com.isamm.projet.banque.model.Credit;


public interface CreditDao {
	
	  public Client getCredit(int id);
		public void ajouterCredit(Credit credit);
		public void supprimerCredit(Credit creit);


}
