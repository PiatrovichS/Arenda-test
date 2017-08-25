package org.arenda.dao;

public class ExceptionEntityDao {
	
	private static final String EXCTPTION_ARENDATOR = "The problem DaoArendator";
	private static final String EXCTPTION_ARENDA = "The problem DaoArenda";

	public void exceptionArendator(){
		System.out.println(EXCTPTION_ARENDATOR);
	}
	public void exceptionArenda(){
		System.out.println(EXCTPTION_ARENDA);
	}
	
}

