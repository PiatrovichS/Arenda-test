package org.arenda.dao;

import java.util.List;

public interface IPomeshenieDao extends IGenericDao<PomeshenieDao, Integer> {

	List<PomeshenieDao> getArendaIdAr(int idPomeshenie);

	PomeshenieDao getAllArendaName(String adres);

	PomeshenieDao getArendatorUnp(int ploshad);

}
