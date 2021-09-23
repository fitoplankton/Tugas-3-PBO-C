class Plane {
   String nameFactory;
   String colour;
   double speed;
   int flyingAltitude;
   boolean isParkingBrakeOn;
   boolean isMoving;
   boolean isEngineStart;
   boolean isTakeOff;

   public Plane(String nameFactory, String colour, int flyingAltitude){
       this.nameFactory = nameFactory;
       this.colour = colour;
       this.flyingAltitude = flyingAltitude;
   }
   
   public void pressAcceleration(){
       this.isParkingBrakeOn = false;
       this.isMoving = true;
       this.isEngineStart = true;
       this.isTakeOff = true;
   }

   public String isMove(){
       return "plane moving = " + this.isMoving;
   }

}

class Airport{
    String codeName;
    String weather;
    double windVelocity;
    boolean isClearRunway;

    public Airport(String codeName, String weather, double windVelocity){
        this.codeName = codeName;
        this.weather = weather;
        this.windVelocity = windVelocity;
    }

    public void isClear(boolean isClear){
        this.isClearRunway = isClear;
    }

    public String takeOff(){
        if (this.isClearRunway){
            Plane tigerAir = new Plane("tigerAir", "Pink", 30000);
            tigerAir.pressAcceleration();
            return tigerAir.isMove();
        }else{
            return("plane cancelled");
        }
    }
}


public class App{
    public static void main(String[] args) {
        Airport CGK = new Airport("CGK", "Cloudy", 36.5);
        CGK.isClear(true);
        System.out.println(CGK.takeOff());
    }
}