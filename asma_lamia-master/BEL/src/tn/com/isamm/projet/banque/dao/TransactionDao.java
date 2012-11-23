package tn.com.isamm.projet.banque.dao;

import java.util.List;

import tn.com.isamm.projet.banque.model.Transaction;

public interface TransactionDao {
	
    public List<Transaction> consulterHistorique(int id);



}
