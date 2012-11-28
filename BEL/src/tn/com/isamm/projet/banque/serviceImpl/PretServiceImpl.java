package tn.com.isamm.projet.banque.serviceImpl;

import tn.com.isamm.projet.banque.dao.PretDao;
import tn.com.isamm.projet.banque.service.PretService;



public class PretServiceImpl implements PretService {

	PretDao pretDaoJpa;

	public PretDao getPretDaoJpa() {
		return pretDaoJpa;
	}

	public void setPretDaoJpa(PretDao pretDaoJpa) {
		this.pretDaoJpa = pretDaoJpa;
	}

}
