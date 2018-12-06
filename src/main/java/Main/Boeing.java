package Main;

import static java.lang.System.*;

public class Boeing<Type> extends Aircraft {

    //************** Parameters ****************************
    int maxSpeed = 1500;
    int maxHeight = 12000;
    int stepSpeed = 30;
    int stepHeight = 50;

    String namePilot;

    //************** Constructor ****************************
    public Boeing(
            Type id,
            String nameObject,
            String model,
            String namePilot
    ){
        super(id, nameObject, model);
        this.namePilot = namePilot;
    }

    //************** Getter && Se... ****************************
    public int getMaxSpeed(){return this.maxSpeed;}
    public int getmaxHeight(){return this.maxHeight;}
    public int getStepSpeed(){return this.stepSpeed;}
    public int getStepHeight(){return this.stepHeight;}

    public String getNamePilot(){return this.namePilot;}

    //************** DISPLAY methods ****************************
    public void displayInfo(){
        out.println(
                "\nRegist.number: " + id +
                        "\nName object: " + nameObject +
                        "\nModel: " + model +
                        "\nPilot: " + namePilot
        );
    }
    public void displayParameters(){
        out.println(
                "\n\t  Max.speed: " + maxSpeed +
                        "\n\t Max.height: " + maxHeight +
                        "\n\t Step speed: " + stepSpeed +
                        "\n\tStep height: " + stepHeight
        );
    }
}
