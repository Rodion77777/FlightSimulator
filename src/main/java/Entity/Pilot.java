package Entity;

public class Pilot {

    //************** Parameters ****************************
    private int id;
    private String name;
    private String surname;
    private int age;
    private String rank;
    private String license;

    //************** Constructor ****************************
    public Pilot(){}

    //************** Getter && Setter ****************************
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setAge(int age) {this.age = age;}
    public void setRank(String rank) {this.rank = rank;}
    public void setLicense(String license) {this.license = license;}

    public int getId() {return id;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public int getAge() {return age;}
    public String getRank() {return rank;}
    public String getLicense() {return license;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pilot pilot = (Pilot) o;

        if (id != pilot.id) return false;
        if (age != pilot.age) return false;
        if (name != null ? !name.equals(pilot.name) : pilot.name != null) return false;
        if (surname != null ? !surname.equals(pilot.surname) : pilot.surname != null) return false;
        if (rank != null ? !rank.equals(pilot.rank) : pilot.rank != null) return false;
        return license != null ? license.equals(pilot.license) : pilot.license == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (license != null ? license.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                ", license='" + license + '\'' +
                '}';
    }
}
