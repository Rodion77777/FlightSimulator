package DAO;

import Entity.Aircrafts;

import java.sql.SQLException;
import java.util.List;

public interface AircraftsDAO {

    //******** CREATE ********
    void add(Aircrafts aircrafts) throws SQLException;

    //******** READ ********
    List<Aircrafts> getAll() throws SQLException;
    Aircrafts getById(int id) throws SQLException;
    Aircrafts getByRegistrationNumber(String registration_number) throws SQLException;

    //******** UPDATE ********
    void update(Aircrafts aircrafts) throws SQLException;

    //******** DELETE ********
    void remove(Aircrafts aircrafts) throws SQLException;
}
