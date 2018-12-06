package Main;

import static java.lang.System.out;

public class CreateAircraft<Type> extends Aircraft {

    //************** Parameters ****************************
    int maxSpeed;
    int maxHeight;
    int stepSpeed;
    int stepHeight;

    String idPilot;

    //************** Constructor ****************************
    public CreateAircraft(
            Type id, String nameObject, String model,
            int maxSpeed,
            int maxHeight,
            int stepSpeed,
            int stepHeight
    ){
        super(id, nameObject, model);
        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;
        this.stepSpeed = stepSpeed;
        this.stepHeight = stepHeight;
    }

    //************** Getter && Setter ****************************
    public void setIdPilot(String idPilot){this.idPilot = idPilot;}
    public String getIdPilot(){return this.idPilot;}

    public int getMaxSpeed(){return this.maxSpeed;}
    public int getmaxHeight(){return this.maxHeight;}
    public int getStepSpeed(){return this.stepSpeed;}
    public int getStepHeight(){return this.stepHeight;}

    //************** DISPLAY methods ****************************
    public void displayInfo(){
        out.println(
                "\nRegist.number: " + id +
                        "\nName object: " + nameObject +
                        "\nModel: " + model +
                        "\nPilot: " + idPilot
        );
    }
    public void displayParameters() {
        out.println(
                "\n\t  Max.speed: " + maxSpeed +
                        "\n\t Max.height: " + maxHeight +
                        "\n\t Step speed: " + stepSpeed +
                        "\n\tStep height: " + stepHeight
        );
    }
}
