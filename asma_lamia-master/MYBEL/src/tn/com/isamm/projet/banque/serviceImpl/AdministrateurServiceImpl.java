package tn.com.isamm.projet.banque.serviceImpl;

import java.util.List;

import tn.com.isamm.projet.banque.dao.AdministrateurDao;
import tn.com.isamm.projet.banque.model.Administrateur;
import tn.com.isamm.projet.banque.service.AdministrateurService;

public class AdministrateurServiceImpl implements AdministrateurService {

	AdministrateurDao adminDaoJpa;
	
	public AdministrateurDao getAdminDaoJpa() {
		return adminDaoJpa;
	}

	public void setAdminDaoJpa(AdministrateurDao adminDaoJpa) {
		this.adminDaoJpa = adminDaoJpa;
	}

	@Override
	public List<Administrateur> consulterAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrateur getAdmin(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
