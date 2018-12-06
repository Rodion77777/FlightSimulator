package Entity;

public class Aircrafts {

    //************** Parameters ****************************
    private int id;
    private String registration_number;
    private String name_object;
    private String model;
    private int max_speed;
    private int max_height;
    private int step_speed;
    private int step_height;

    //************** Constructor ****************************
    public Aircrafts(){}

    //************** Getter && Setter ****************************
    public void setId(int id) {this.id = id;}
    public void setRegistration_number(String registration_number) {this.registration_number = registration_number;}
    public void setName_object(String name_object) {this.name_object = name_object;}
    public void setModel(String model) {this.model = model;}
    public void setMax_speed(int max_speed) {this.max_speed = max_speed;}
    public void setMax_height(int max_height) {this.max_height = max_height;}
    public void setStep_speed(int step_speed) {this.step_speed = step_speed;}
    public void setStep_height(int step_height) {this.step_height = step_height;}

    public int getId() {return id;}
    public String getRegistration_number() {return registration_number;}
    public String getName_object() {return name_object;}
    public String getModel() {return model;}
    public int getMax_speed() {return max_speed;}
    public int getMax_height() {return max_height;}
    public int getStep_speed() {return step_speed;}
    public int getStep_height() {return step_height;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aircrafts aircrafts = (Aircrafts) o;

        if (id != aircrafts.id) return false;
        if (max_speed != aircrafts.max_speed) return false;
        if (max_height != aircrafts.max_height) return false;
        if (step_speed != aircrafts.step_speed) return false;
        if (step_height != aircrafts.step_height) return false;
        if (registration_number != null ? !registration_number.equals(aircrafts.registration_number) : aircrafts.registration_number != null)
            return false;
        if (name_object != null ? !name_object.equals(aircrafts.name_object) : aircrafts.name_object != null)
            return false;
        return model != null ? model.equals(aircrafts.model) : aircrafts.model == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (registration_number != null ? registration_number.hashCode() : 0);
        result = 31 * result + (name_object != null ? name_object.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + max_speed;
        result = 31 * result + max_height;
        result = 31 * result + step_speed;
        result = 31 * result + step_height;
        return result;
    }

    @Override
    public String toString() {
        return "Aircrafts{" +
                "id=" + id +
                ", registration_number='" + registration_number + '\'' +
                ", name_object='" + name_object + '\'' +
                ", model='" + model + '\'' +
                ", max_speed=" + max_speed +
                ", max_height=" + max_height +
                ", step_speed=" + step_speed +
                ", step_height=" + step_height +
                '}';
    }
}
