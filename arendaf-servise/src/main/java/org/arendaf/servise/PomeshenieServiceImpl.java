package org.arendaf.servise;

import org.apache.log4j.Logger;
import org.arenda.daoimpl.ArendatorDao;
import org.arenda.daoimpl.PomeshenieDao;
import org.arendaf.api.IPomeshenieDao;
import org.arendaf.modelsf.Pomeshenie;
import org.hibernate.Session;
import Util.HibernateUtil;

public class PomeshenieServiceImpl {

	private static final Logger log = Logger.getLogger(ArendatorDao.class);

	private IPomeshenieDao<Pomeshenie> arendaPomeshenieDao = new PomeshenieDao();

	private final HibernateUtil hibernateUtil = HibernateUtil.getInstance();

	public void create(Pomeshenie pomeshenie) {

		Session session = hibernateUtil.openSession();
		try {
			session.beginTransaction();
			arendaPomeshenieDao.create(session, pomeshenie);
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			log.error("Error in service, test method", e);
		} finally {
			session.close();
		}

	}
}
