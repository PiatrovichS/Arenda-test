package org.arenda.dao;

import java.util.List;

public interface INachislenieDao extends IGenericDao<NachislenieDao, Integer> {
	
	List<NachislenieDao> getNachislenieDaoIdAr(int idArendator);

	NachislenieDao getAllNachislenieSum(Double sum);

	}
