package tn.com.isamm.projet.banque.service;

import java.util.List;

import tn.com.isamm.projet.banque.model.Administrateur;

public interface AdministrateurService {
	
    public List<Administrateur> consulterAdmin();
    public Administrateur getAdmin(int id);


}
