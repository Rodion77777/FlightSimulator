package Main;

import static java.lang.System.*;
import com.mysql.fabric.jdbc.FabricMySQLDriver;
import java.sql.*;

public class SetToDB {

    //************** Parameters ****************************
    private static final String URL = "jdbc:mysql://localhost:3306/newdatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "JavaDeveloperSeniorOver9000*";

    public static void setData(String request){

        Connection connection;

        try{
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //Statement statement = connection.createStatement();

            if(!connection.isClosed()) out.println("Соединение с БД установлено!");

            //statement.execute(request);

            if(connection.isClosed()) out.println("Соединение с БД закрыто!");
        }catch(SQLException e){
            err.println("Не удалось загрузить класс драйвера.");
        }
    }

}
