package Service;

import static java.lang.System.err;

import DAO.PilotDAO;
import DataBase.Util;
import Entity.Pilot;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

public class PilotService extends Util implements PilotDAO {

    Connection connection = getConnection();

    //******** CREATE ********
    @Override
    public void add(Pilot pilot) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO pilot (name, surname, age, rank, license) VALUES (?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, pilot.getName());
                preparedStatement.setString(2, pilot.getSurname());
                    preparedStatement.setInt(3, pilot.getAge());
                        preparedStatement.setString(4, pilot.getRank());
                        preparedStatement.setString(5, pilot.getLicense());

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (PilotService.add)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }

    //******** READ ALL ********
    @Override
    public List<Pilot> getAll() throws SQLException {

        List<Pilot> pilotList = new ArrayList<>();

        String sql = "SELECT id, name, surname, age, rank, license FROM pilot";

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                Pilot pilot = new Pilot();

                    pilot.setId(resultSet.getInt("id"));
                    pilot.setName(resultSet.getString("name"));
                        pilot.setSurname(resultSet.getString("surname"));
                            pilot.setRank(resultSet.getString("rank"));
                            pilot.setLicense(resultSet.getString("license"));

                pilotList.add(pilot);
            }

        } catch (SQLException e){
            err.println("SQLException: Statement will not execute! (PilotService.getAll)");
            e.printStackTrace();
        } finally {
            if(statement != null) statement.close();
            if(connection != null) connection.close();
        }

        return pilotList;
    }

    //******** READ ONE ********
    @Override
    public Pilot getById(int id) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, name, surname, age, rank, license FROM pilot WHERE id = ?";

        Pilot pilot = new Pilot();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

                pilot.setId(resultSet.getInt("id"));
                    pilot.setName(resultSet.getString("name"));
                    pilot.setSurname(resultSet.getString("surname"));
                        pilot.setAge(resultSet.getInt("age"));
                            pilot.setRank(resultSet.getString("rank"));
                            pilot.setLicense(resultSet.getString("license"));

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (PilotService.getById)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }

        return pilot;
    }

    @Override
    public Pilot getByRank(String rank) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, name, surname, age, rank, license FROM pilot WHERE rank = ?";

        Pilot pilot = new Pilot();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, rank);
            ResultSet resultSet = preparedStatement.executeQuery();

                pilot.setId(resultSet.getInt("id"));
                    pilot.setName(resultSet.getString("name"));
                    pilot.setSurname(resultSet.getString("surname"));
                        pilot.setAge(resultSet.getInt("age"));
                            pilot.setRank(resultSet.getString("rank"));
                            pilot.setLicense(resultSet.getString("license"));

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (PilotService.getByRank)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }

        return pilot;
    }

    @Override
    public Pilot getByLicense(String license) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, name, surname, age, rank, license FROM pilot WHERE license = ?";

        Pilot pilot = new Pilot();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, license);
            ResultSet resultSet = preparedStatement.executeQuery();

                pilot.setId(resultSet.getInt("id"));
                    pilot.setName(resultSet.getString("name"));
                    pilot.setSurname(resultSet.getString("surname"));
                        pilot.setAge(resultSet.getInt("age"));
                            pilot.setRank(resultSet.getString("rank"));
                            pilot.setLicense(resultSet.getString("license"));

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (PilotService.getByLicense)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }

        return pilot;
    }

    //******** UPDATE ********
    @Override
    public void update(Pilot pilot) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "UPDATE pilot SET name = ?, surname = ?, age = ?, rank = ?, license = ? WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, pilot.getName());
                preparedStatement.setString(2, pilot.getSurname());
                    preparedStatement.setInt(3, pilot.getAge());
                        preparedStatement.setString(4, pilot.getRank());
                        preparedStatement.setString(5, pilot.getLicense());
                            preparedStatement.setInt(6, pilot.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (PilotService.update)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }

    //******** DELETE ********
    @Override
    public void remove(Pilot pilot) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM pilot WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, pilot.getId());

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (PilotService.remove)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }

    }
}
/*
import static java.lang.System.err;

import DAO.PilotDAO;
import DataBase.Util;
import Entity.Pilot;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
*/