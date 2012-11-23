package tn.com.isamm.projet.banque.serviceImpl;

import java.util.List;

import tn.com.isamm.projet.banque.dao.ChargeClienteleDao;
import tn.com.isamm.projet.banque.model.ChargeClientele;
import tn.com.isamm.projet.banque.service.ChargeClienteleService;



public class ChargeClienteleServiceImpl implements ChargeClienteleService {
	
	ChargeClienteleDao chargeDaoJpa;

	public ChargeClienteleDao getChargeDaoJpa() {
		return chargeDaoJpa;
	}

	public void setChargeDaoJpa(ChargeClienteleDao chargeDaoJpa) {
		this.chargeDaoJpa = chargeDaoJpa;
	}

	@Override
	public List<ChargeClientele> consulterCherge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ChargeClientele getCharge(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void activerCompte(int id) {
		// TODO Auto-generated method stub
		
	}



}
