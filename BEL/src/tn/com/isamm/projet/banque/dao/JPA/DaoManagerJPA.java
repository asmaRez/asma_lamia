package tn.com.isamm.projet.banque.dao.JPA;

import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import tn.com.isamm.projet.banque.dao.DaoManager;

public  class DaoManagerJPA<T> {
	public static Logger logger = Logger.getLogger(DaoManagerJPA.class.getName());
	private Long idUser;
	private Long idFonc;

	
	public DaoManagerJPA() {
		super();
	}

	public EntityManager getEntityManager() {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("BEL");
	return emf.createEntityManager();
	}

	public T findObject(Class<T> classe, Object id) throws Exception {
	EntityManager em = getEntityManager();
	try {
	return em.find(classe, id);
	} catch (Exception e) {
	
	throw e;
	} finally {
	em.close();
	}
	}

	public T createObject(T classe) throws Exception {
	
	EntityManager em = getEntityManager();
	EntityTransaction tx = null;

	try {
	tx = em.getTransaction();
	tx.begin();
	em.persist(classe);
	em.flush();
	tx.commit();
	} catch (Exception ex) {
	try {
	tx.rollback();
	
	} catch (Exception e) {
	throw e;
	}
	throw ex;
	} finally {
	em.close();
	}
	return classe;
	}

	public void deleteObject(T classe) throws Exception {
	EntityManager em = getEntityManager();
	EntityTransaction tx = null;
	try {
	tx = em.getTransaction();
	tx.begin();
	classe = em.merge(classe);
	em.remove(classe);
	tx.commit();
	} catch (Exception ex) {
	try {
	tx.rollback();
	} catch (Exception e) {
	throw e;
	}
	throw ex;
	} finally {
	em.close();
	}

	}

	public T updateObject(T classe) throws Exception {

	EntityManager em = getEntityManager();
	EntityTransaction tx = null;
	try {
	tx = em.getTransaction();
	tx.begin();
	classe = em.merge(classe);
	em.flush();
	tx.commit();
	} catch (Exception ex) {
	try {
	tx.rollback();
	} catch (Exception e) {
	throw e;
	}
	throw ex;
	} finally {
	em.close();
	}
	return classe;

	}

	

	}


