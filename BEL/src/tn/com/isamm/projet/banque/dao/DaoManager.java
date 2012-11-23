package tn.com.isamm.projet.banque.dao;

import javax.persistence.EntityManager;

public interface DaoManager<T> {
	
	
	public T findObject(Class<T> classe, Object id);
	public T createObject(T classe);
	public void deleteObject(T classe);
	public T updateObject(T classe);
}
