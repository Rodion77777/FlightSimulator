package Main;

import Entity.Aircrafts;
import Entity.Dispatcher;
import Entity.Pilot;
import Service.AircraftsService;
import Service.DispatcherService;
import Service.PilotService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        AircraftsService aircraftsService = new AircraftsService();
        DispatcherService dispatcherService = new DispatcherService();
        PilotService pilotService = new PilotService();

        Aircrafts antonov = new Aircrafts();
            antonov.setRegistration_number("BH2729-N");
            antonov.setName_object("Antonov");
            antonov.setModel("28");
                antonov.setMax_speed(355);
                antonov.setMax_height(6000);
                antonov.setStep_speed(15);
                antonov.setStep_height(40);


        Dispatcher kiev = new Dispatcher();
            kiev.setCity("Kiev");
            kiev.setWeather_coefficient(WeatherStation.getWeatherIndex(true));
            //dispatcher.setRecomended_height();


        Pilot pilot = new Pilot();

        try {
            aircraftsService.add(antonov);
            dispatcherService.add(kiev);
            pilotService.add(pilot);
        } catch (SQLException e){ e.printStackTrace(); }
    }
}
