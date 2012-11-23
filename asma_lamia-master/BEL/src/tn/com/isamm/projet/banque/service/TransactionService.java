package tn.com.isamm.projet.banque.service;

import java.util.List;

import tn.com.isamm.projet.banque.model.Transaction;

public interface TransactionService {
	
    public List<Transaction> consulterHistorique(int id);



}
