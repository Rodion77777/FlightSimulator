package DAO;

import Entity.Dispatcher;

import java.sql.SQLException;
import java.util.List;

public interface DispatcherDAO {
    //******** CREATE ********
    void add(Dispatcher dispatcher) throws SQLException;

    //******** READ ********
    List<Dispatcher> getAll() throws SQLException;
    Dispatcher getById(int id) throws SQLException;
    Dispatcher getByCity(String city) throws SQLException;

    //******** UPDATE ********
    void update(Dispatcher dispatcher) throws SQLException;

    //******** DELETE ********
    void remove(Dispatcher dispatcher) throws SQLException;
}
