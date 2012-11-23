package tn.com.isamm.projet.banque.serviceImpl;

import tn.com.isamm.projet.banque.dao.CreditDao;
import tn.com.isamm.projet.banque.service.CreditService;


public class CreditServiceImpl implements CreditService {
	
	CreditDao creditDaoJpa;

	public CreditDao getCreditDaoJpa() {
		return creditDaoJpa;
	}

	public void setCreditDaoJpa(CreditDao creditDaoJpa) {
		this.creditDaoJpa = creditDaoJpa;
	}

}
