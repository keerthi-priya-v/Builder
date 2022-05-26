package builder;

public class BuilderPattern {
  
  public static void main(String[] args) {
    Vehicle car = new Vehicle.VehicleBuilder("3000cd", 4).setAirbags(4).build();
    Vehicle bike = new Vehicle.VehicleBuilder("2904ip", 2).build();
    System.out.println("----Car---");
    System.out.println("Engine : " + car.getEngine());
    System.out.println("Wheels : "+ car.getWheel());
    System.out.println("Airbags : " + car.getAirbags());
    System.out.println("----Bike---");
    System.out.println("Engine : " + bike.getEngine());
    System.out.println("Wheels : "+bike.getWheel());
    System.out.println("Airbags : " + bike.getAirbags());
  }
}