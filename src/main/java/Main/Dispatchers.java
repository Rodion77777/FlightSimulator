package Main;

import java.util.Random;

public abstract class Dispatchers {

    //************** Parameters ****************************
    private String name;
    private String surname;
    private String city;
    private int weather;
    private int recomendedHeight;

    //************** Constructor ****************************
    public Dispatchers(
            String name,
            String surname,
            String city
    ){
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    //************** Getter && Setter ****************************
    void setNameDispatcher(String name){this.name = name;}
    void setSurnameDispatcher(String surname){this.surname = surname;}
    void setWeather(int weather){this.weather = weather;}
    void setRecomendedHeight(int recomendedHeight){this.recomendedHeight = recomendedHeight;}

    String getNameDispatcher(){return this.name;}
    String getSurnameDispatcher(){return this.surname;}
    String getCity(){return this.city;}
    int getWeather(){return this.weather;}
    int getRecomendedHeight(){return this.recomendedHeight;}

    public int getNewRecomendedHeight(boolean activateRodar){
        if(activateRodar) setWeather(WeatherStation.meteoRodar());
        Random r = new Random();

        if(WeatherStation.getWeatherIndex(false)>0)this.recomendedHeight = r.nextInt((10)+2)*1000;
        else this.recomendedHeight = r.nextInt((5)+2)*1000;

        r = null;
        return recomendedHeight;
    }
}
