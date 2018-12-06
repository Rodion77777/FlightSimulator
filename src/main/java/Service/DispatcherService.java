package Service;

import static java.lang.System.err;

import DAO.DispatcherDAO;
import DataBase.Util;
import Entity.Dispatcher;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;
import java.util.ArrayList;

public class DispatcherService extends Util implements DispatcherDAO {

    Connection connection = getConnection();

    //******** CREATE ********
    @Override
    public void add(Dispatcher dispatcher) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO dispatcher (name, surname, city, weather_coefficient, recomended_height) VALUES (?, ?, ?, ?, ?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, dispatcher.getName());
                preparedStatement.setString(2, dispatcher.getSurname());
                preparedStatement.setString(3, dispatcher.getCity());
                    preparedStatement.setInt(4, dispatcher.getWeather_coefficient());
                    preparedStatement.setInt(5, dispatcher.getRecomended_height());

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (DispatcherService.add)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }

    //******** READ ALL ********
    @Override
    public List<Dispatcher> getAll() throws SQLException {

        List<Dispatcher> dispatcherList = new ArrayList<>();

        String sql = "SELECT id, name, surname, city, weather_coefficient, recomended_height FROM dispatcher";

        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                Dispatcher dispatcher = new Dispatcher();

                    dispatcher.setId(resultSet.getInt("id"));
                        dispatcher.setName(resultSet.getString("name"));
                        dispatcher.setSurname(resultSet.getString("surname"));
                        dispatcher.setCity(resultSet.getString("city"));
                            dispatcher.setRecomended_height(resultSet.getInt("recomended_height"));
                            dispatcher.setWeather_coefficient(resultSet.getInt("recomended_height"));

                dispatcherList.add(dispatcher);
            }

        } catch (SQLException e){
            err.println("SQLException: Statement will not execute! (DispatcherService.getAll)");
            e.printStackTrace();
        } finally {
            if(statement != null) statement.close();
            if(connection != null) connection.close();
        }

        return dispatcherList;
    }

    //******** READ ONE ********
    @Override
    public Dispatcher getById(int id) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "SELECT id,  name, surname, city, weather_coefficient, recomended_height FROM dispatcher WHERE id = ?";

        Dispatcher dispatcher = new Dispatcher();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

                dispatcher.setId(resultSet.getInt("id"));
                    dispatcher.setName(resultSet.getString("name"));
                    dispatcher.setSurname(resultSet.getString("surname"));
                    dispatcher.setCity(resultSet.getString("city"));
                        dispatcher.setWeather_coefficient(resultSet.getInt("weather_coefficient"));
                        dispatcher.setRecomended_height(resultSet.getInt("recomended_height"));

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (DispatcherService.getById)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }

        return dispatcher;
    }

    @Override
    public Dispatcher getByCity(String city) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "SELECT id,  name, surname, city, weather_coefficient, recomended_height FROM dispatcher WHERE city = ?";

        Dispatcher dispatcher = new Dispatcher();

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, city);
            ResultSet resultSet = preparedStatement.executeQuery();

                dispatcher.setId(resultSet.getInt("id"));
                    dispatcher.setName(resultSet.getString("name"));
                    dispatcher.setSurname(resultSet.getString("surname"));
                    dispatcher.setCity(resultSet.getString("city"));
                        dispatcher.setWeather_coefficient(resultSet.getInt("weather_coefficient"));
                        dispatcher.setRecomended_height(resultSet.getInt("recomended_height"));

            preparedStatement.executeUpdate();

        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (DispatcherService.getByCity)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }

        return dispatcher;
    }

    //******** UPDATE ********
    @Override
    public void update(Dispatcher dispatcher) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "UPDATE dispatcher SET name = ?, surname = ?, city = ?, weather_coefficient = ?, recomended_height = ? WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, dispatcher.getName());
                preparedStatement.setString(2, dispatcher.getSurname());
                preparedStatement.setString(3, dispatcher.getCity());
                    preparedStatement.setInt(4, dispatcher.getWeather_coefficient());
                    preparedStatement.setInt(5, dispatcher.getRecomended_height());
                        preparedStatement.setInt(6, dispatcher.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (DispatcherService.update)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }

    //******** DELETE ********
    @Override
    public void remove(Dispatcher dispatcher) throws SQLException {

        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM dispatcher WHERE id = ?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, dispatcher.getId());

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            err.println("SQLException: PreparedStatement will not execute! (DispatcherService.remove)");
            e.printStackTrace();
        } finally {
            if(preparedStatement != null) preparedStatement.close();
            if(connection != null) connection.close();
        }
    }
}
/*
import static java.lang.System.err;

import DAO.DispatcherDAO;
import DataBase.Util;
import Entity.Dispatcher;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;
import java.util.ArrayList;
*/