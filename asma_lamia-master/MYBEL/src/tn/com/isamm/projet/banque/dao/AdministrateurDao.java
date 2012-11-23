package tn.com.isamm.projet.banque.dao;

import java.util.List;

import tn.com.isamm.projet.banque.model.Administrateur;

public interface AdministrateurDao {
	
    public List<Administrateur> consulterAdmin();
    public Administrateur getAdmin(int id);


}
