package tn.com.isamm.projet.banque.dao;

import java.util.List;

import tn.com.isamm.projet.banque.model.ChargeClientele;


public interface ChargeClienteleDao {
	
    public List<ChargeClientele> consulterCherge();
    public ChargeClientele getCharge(int id);
    public void activerCompte(int id);


}
