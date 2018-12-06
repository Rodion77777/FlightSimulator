package DAO;

import Entity.Pilot;

import java.sql.SQLException;
import java.util.List;

public interface PilotDAO {
    //******** CREATE ********
    void add(Pilot pilot) throws SQLException;

    //******** READ ********
    List<Pilot> getAll() throws SQLException;
    Pilot getById(int id) throws SQLException;
    Pilot getByRank(String rank) throws SQLException;
    Pilot getByLicense(String license) throws SQLException;

    //******** UPDATE ********
    void update(Pilot pilot) throws SQLException;

    //******** DELETE ********
    void remove(Pilot pilot) throws SQLException;
}
