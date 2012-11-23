package tn.com.isamm.projet.banque.serviceImpl;

import java.util.List;

import tn.com.isamm.projet.banque.dao.TransactionDao;
import tn.com.isamm.projet.banque.model.Transaction;
import tn.com.isamm.projet.banque.service.TransactionService;

public class TransactionServiceImpl implements TransactionService {

	TransactionDao transactionDaoJpa;
	
	
	public TransactionDao getTransactionDaoJpa() {
		return transactionDaoJpa;
	}


	public void setTransactionDaoJpa(TransactionDao transactionDaoJpa) {
		this.transactionDaoJpa = transactionDaoJpa;
	}


	@Override
	public List<Transaction> consulterHistorique(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
