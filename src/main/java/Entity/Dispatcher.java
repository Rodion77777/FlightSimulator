package Entity;

public class Dispatcher {

    //************** Parameters ****************************
    private int id;
    private String name;
    private String surname;
    private String city;
    private int weather_coefficient;
    private int recomended_height;

    //************** Constructor ****************************
    public Dispatcher(){}

    //************** Getter && Setter ****************************

    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setCity(String city) {this.city = city;}
    public void setWeather_coefficient(int weather_coefficient) {this.weather_coefficient = weather_coefficient;}
    public void setRecomended_height(int recomended_height) {this.recomended_height = recomended_height;}

    public int getId() {return id;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getCity() {return city;}
    public int getWeather_coefficient() {return weather_coefficient;}
    public int getRecomended_height() {return recomended_height;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dispatcher that = (Dispatcher) o;

        if (id != that.id) return false;
        if (weather_coefficient != that.weather_coefficient) return false;
        if (recomended_height != that.recomended_height) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        return city != null ? city.equals(that.city) : that.city == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + weather_coefficient;
        result = 31 * result + recomended_height;
        return result;
    }

    @Override
    public String toString() {
        return "Dispatcher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", weather_coefficient=" + weather_coefficient +
                ", recomended_height=" + recomended_height +
                '}';
    }
}
