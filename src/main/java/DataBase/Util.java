package DataBase;

import static java.lang.System.err;
import static java.lang.System.out;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    //************** Parameters ****************************
    //private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/newdatabase";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "JavaDeveloperSeniorOver9000*";

    public Connection getConnection(){

        Connection connection = null;

        try{
            //Class.forName(DRIVER);
            //Driver driver = new FabricMySQLDriver();
            //DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            if(!connection.isClosed()) out.println("Соединение с БД установлено!");
            if(connection.isClosed()) out.println("Соединение с БД закрыто!");
        }catch(SQLException e){
            err.println("Не удалось загрузить класс драйвера.");
        }//catch(ClassNotFoundException){}

        return connection;
    }
}

