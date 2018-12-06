package Service;

import static java.lang.System.err;

import DAO.AircraftsDAO;
import DataBase.Util;
import Entity.Aircrafts;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

public class AircraftsService extends Util implements AircraftsDAO {

    Connection connection = getConnection();

    //******** CREATE ********
    @Override
    public void add(Aircrafts aircrafts) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO aircrafts (registration_number, name_object, model, max_speed, max_height, step_speed, step_height) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, aircrafts.getRegistration_number());
                preparedStatement.setString(2, aircrafts.getName_object());
                preparedStatement.setString(3, aircrafts.getModel());
                    preparedStatement.setInt(4, aircrafts.getMax_speed());
                    preparedStatement.setInt(5, aircrafts.getMax_height());
                    preparedStatement.setInt(6, aircrafts.getStep_speed());
                    preparedStatement.setInt(7, aircrafts.getStep_height());

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (AircraftsService.add)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }

    //******** READ ALL ********
    @Override
    public List<Aircrafts> getAll() throws SQLException {

        List<Aircrafts> aircraftsList = new ArrayList<>();

        String sql = "SELECT id, registration_number, name_object, model, max_speed, max_height, step_speed, step_height FROM aircrafts";

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()){
                    Aircrafts aircrafts = new Aircrafts();

                        aircrafts.setId(resultSet.getInt("id"));
                            aircrafts.setRegistration_number(resultSet.getString("registration_number"));
                            aircrafts.setName_object(resultSet.getString("name_object"));
                            aircrafts.setModel(resultSet.getString("model"));
                                aircrafts.setMax_speed(resultSet.getInt("max_speed"));
                                aircrafts.setMax_height(resultSet.getInt("max_height"));
                                aircrafts.setStep_speed(resultSet.getInt("step_speed"));
                                aircrafts.setStep_height(resultSet.getInt("step_height"));

                    aircraftsList.add(aircrafts);
                }

        } catch (SQLException e){
            err.println("SQLException: Statement will not execute! (AircraftsService.getAll)");
            e.printStackTrace();
        } finally {
            if(statement != null) statement.close();
            if(connection != null) connection.close();
        }

        return aircraftsList;
    }

    //******** READ ONE ********
    @Override
    public Aircrafts getById(int id) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, registration_number, name_object, model, max_speed, max_height, step_speed, step_height FROM aircrafts WHERE id = ?";

        Aircrafts aircrafts = new Aircrafts();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

                aircrafts.setId(resultSet.getInt("id"));
                    aircrafts.setRegistration_number(resultSet.getString("registration_number"));
                    aircrafts.setName_object(resultSet.getString("name_object"));
                    aircrafts.setModel(resultSet.getString("model"));
                        aircrafts.setMax_speed(resultSet.getInt("max_speed"));
                        aircrafts.setMax_height(resultSet.getInt("max_height"));
                        aircrafts.setStep_speed(resultSet.getInt("step_speed"));
                        aircrafts.setStep_height(resultSet.getInt("step_height"));

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (AircraftsService.getById)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }

        return aircrafts;
    }

    @Override
    public Aircrafts getByRegistrationNumber(String registration_number) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "SELECT id, registration_number, name_object, model, max_speed, max_height, step_speed, step_height FROM aircrafts WHERE registration_number = ?";

        Aircrafts aircrafts = new Aircrafts();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, registration_number);
            ResultSet resultSet = preparedStatement.executeQuery();

                aircrafts.setId(resultSet.getInt("id"));
                    aircrafts.setRegistration_number(resultSet.getString("registration_number"));
                    aircrafts.setName_object(resultSet.getString("name_object"));
                    aircrafts.setModel(resultSet.getString("model"));
                        aircrafts.setMax_speed(resultSet.getInt("max_speed"));
                        aircrafts.setMax_height(resultSet.getInt("max_height"));
                        aircrafts.setStep_speed(resultSet.getInt("step_speed"));
                        aircrafts.setStep_height(resultSet.getInt("step_height"));

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (AircraftsService.getByRegistrationNumber)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }

        return aircrafts;
    }

    //******** UPDATE ********
    @Override
    public void update(Aircrafts aircrafts) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "UPDATE aircrafts SET registration_number = ?, name_object = ?, model = ?, max_speed = ?, max_height = ?, step_speed = ?, step_height = ? WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, aircrafts.getRegistration_number());
                preparedStatement.setString(2, aircrafts.getName_object());
                preparedStatement.setString(3, aircrafts.getModel());
                    preparedStatement.setInt(4, aircrafts.getMax_speed());
                    preparedStatement.setInt(5, aircrafts.getMax_height());
                    preparedStatement.setInt(6, aircrafts.getStep_speed());
                    preparedStatement.setInt(7, aircrafts.getStep_height());
                        preparedStatement.setInt(8, aircrafts.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (AircraftsService.update)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }

    //******** DELETE ********
    @Override
    public void remove(Aircrafts aircrafts) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM aircrafts WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, aircrafts.getId());

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (AircraftsService.remove)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }
}
/*
import static java.lang.System.err;

import DAO.AircraftsDAO;
import DataBase.Util;
import Entity.Aircrafts;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;
*/