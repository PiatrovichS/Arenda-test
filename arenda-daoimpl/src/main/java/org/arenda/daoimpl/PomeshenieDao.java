package org.arenda.daoimpl;

import java.sql.SQLException;
import java.util.List;

import org.arendaf.api.IPomeshenieDao;
import org.arendaf.modelsf.Pomeshenie;
import org.hibernate.Session;

import Util.HibernateUtil;

public class PomeshenieDao implements IPomeshenieDao<Pomeshenie> {

	public List<Pomeshenie> getPomeshenieIdPomeshenie(int idPomeshenie) {

		List<Pomeshenie> getPomeshenieIdPomeshenie = null;

		Session session = null;
		try {
			session = HibernateUtil.getInstance().openSession();
			getPomeshenieIdPomeshenie = session.createCriteria(Pomeshenie.class).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}
		return getPomeshenieIdPomeshenie;
	}

	public List<Pomeshenie> getAllPomeshenieAdres(String adres) {

		List<Pomeshenie> getAllPomeshenieAdres = null;

		Session session = null;
		try {
			session = HibernateUtil.getInstance().openSession();
			getAllPomeshenieAdres = session.createCriteria(adres).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}
		return getAllPomeshenieAdres;
	}

	public List<Pomeshenie> getPomesheniePloshad(int ploshad) {

		List<Pomeshenie> getPomesheniePloshad = null;

		Session session = null;
		try {
			session = HibernateUtil.getInstance().openSession();
			getPomesheniePloshad = session.createCriteria(Pomeshenie.class).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}
		return getPomesheniePloshad;
	}

	public void delete(Pomeshenie pomeshenie) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getInstance().openSession();
			session.beginTransaction();
			session.delete(pomeshenie);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();

		}
	}

	public void update(Pomeshenie pomeshenie) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getInstance().openSession();
			session.beginTransaction();
			session.update(pomeshenie);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();

		}

	}

	public void create(Session session, Pomeshenie pomeshenie) throws SQLException {

		try {
			session = HibernateUtil.getInstance().openSession();
			session.beginTransaction();
			session.save(pomeshenie);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ((session != null) && (session.isOpen()))
				session.close();
		}

	}

}
