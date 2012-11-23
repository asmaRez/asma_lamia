package tn.com.isamm.projet.banque.serviceImpl;


import tn.com.isamm.projet.banque.dao.DebitDao;
import tn.com.isamm.projet.banque.service.DebitService;


public class DebitServiceImpl implements DebitService {

	DebitDao debitDaoJpa;

	public DebitDao getDebitDaoJpa() {
		return debitDaoJpa;
	}

	public void setDebitDaoJpa(DebitDao debitDaoJpa) {
		this.debitDaoJpa = debitDaoJpa;
	}

}
