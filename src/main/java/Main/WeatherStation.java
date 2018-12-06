package Main;

import java.util.Random;

public class WeatherStation {
    private static int weatherIndex;

    private static void setWeatherIndex(int index){WeatherStation.weatherIndex = index;}
    public static int getWeatherIndex(boolean meteoRodar){
        if(meteoRodar) meteoRodar();
        return WeatherStation.weatherIndex;}
    public static int meteoRodar(){
        Random r = new Random();
        setWeatherIndex(r.nextInt(400)-200);
        return weatherIndex;
    }
}
