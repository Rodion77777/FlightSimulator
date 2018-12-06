package Main;

import static java.lang.System.out;

public abstract class Aircraft<Type> {

    //************** Parameters ****************************
    Type id;
    String nameObject;
    String model;

    //************** Constructor ****************************
    Aircraft(Type id, String nameObject, String model){
        this.id = id;
        this.nameObject = nameObject;
        this.model = model;
    }

    //************** Getter && Setter ****************************
    Type getId(){return this.id;}
    String getNameObject(){return this.nameObject;}
    String getModel(){return this.model;}
}
