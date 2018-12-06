package Main;

import static java.lang.System.*;
import java.util.Scanner;

public class CreateNewObject {
    public static void typeAircraft(){

        Scanner scanner = new Scanner(in);

        out.print("\n\tRegistration number: ");
        String id = scanner.nextLine();
        out.print("\n\tName object: ");
        String nameObject = scanner.nextLine();
        out.print("\n\tModel: ");
        String model = scanner.nextLine();

        out.print("\n\tMaximal speed: ");
        int maxSpeed = scanner.nextInt();
        out.print("\n\tMaximal height: ");
        int maxHeight = scanner.nextInt();
        out.print("\n\tStep speed: ");
        int stepSpeed = scanner.nextInt();
        out.print("\n\tStep height: ");
        int stepHeight = scanner.nextInt();

        scanner.close();

        //CreateAircraft newAircraft = new CreateAircraft(id, nameObject, model, maxSpeed, maxHeight, stepSpeed, stepHeight);

        String newObjectAircraft = "INSERT INTO aircrafts (registration_number, name_object, model, max_speed, max_height, step_speed, step_height)" +
                "VALUES ("+id+", "+nameObject+", "+model+", "+Integer.toString(maxSpeed)+", "+Integer.toString(maxHeight)+", "+Integer.toString(stepSpeed)+", "+Integer.toString(stepHeight)+")";

        out.println(newObjectAircraft);
        //SetToDB.setData(newObjectAircraft);
    }

    public static void typeDispatcher(){
        Scanner scanner = new Scanner(in);

        out.print("\n\tName dispatcher: ");
        String name = scanner.nextLine();
        out.print("\n\tSurname dispatcher: ");
        String surname = scanner.nextLine();
        out.print("\n\tLocation city: ");
        String city = scanner.nextLine();

        Dispatcher dispatcher = new Dispatcher("Tatiana", "Boo", "Kiev");

        int weatherIndex = WeatherStation.meteoRodar();
        dispatcher.setWeather(weatherIndex);
        dispatcher.getNewRecomendedHeight(false);

        int weather = dispatcher.getWeather();
        int recomendedHeight = dispatcher.getRecomendedHeight();

        scanner.close();

        String newObjectDispatcher = "INSERT INTO dispatcher (name, surname, city, weather_coefficient, recomended_height)" +
                "VALUES ("+name+", "+surname+", "+city+", "+weather+", "+recomendedHeight+")";
    }

    public static void typePilot(){
        Scanner scanner = new Scanner(in);

        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        int age = scanner.nextInt();
        String rank = scanner.nextLine();
        String license = scanner.nextLine();

        scanner.close();

        String newObjectPilot = "INSERT INTO pilot (name, surname, age, rank, license)" +
                "VALUES ("+name+", "+surname+", "+Integer.toString(age)+" "+rank+", "+license+")";

        out.println(newObjectPilot);
        //SetToDB.setData(newObjectPilot);
    }
}
