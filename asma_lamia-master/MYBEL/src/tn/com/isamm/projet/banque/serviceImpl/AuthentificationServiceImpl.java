package tn.com.isamm.projet.banque.serviceImpl;

import tn.com.isamm.projet.banque.dao.AuthentificationDao;
import tn.com.isamm.projet.banque.service.AuthentificationService;


public class AuthentificationServiceImpl implements AuthentificationService {

	AuthentificationDao authDaoJpa;

	public AuthentificationDao getAuthDaoJpa() {
		return authDaoJpa;
	}

	public void setAuthDaoJpa(AuthentificationDao authDaoJpa) {
		this.authDaoJpa = authDaoJpa;
	}

}
