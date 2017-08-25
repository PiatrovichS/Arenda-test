package org.arenda.dao;

import java.util.List;

public interface IArendatorDao extends IGenericDao<ArendatorDao, Integer> {

	List<ArendatorDao> getArendaIdAr(int idArendator);

	ArendatorDao getAllArendaName(String name);

	ArendatorDao getArendatorUnp(int unp);

}
