package org.arenda.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

public interface IGenericDao <E,K extends Serializable> {
    
    public void delete(K id) throws SQLException;
    public E create() throws SQLException;
    void insert(E entityArenda) throws SQLException;
    public void update(E entityArenda) throws SQLException;
    public List<E> getAllEntityArenda() throws SQLException;
    E getEntityArendaByIdAr(K id)throws SQLException;

}
