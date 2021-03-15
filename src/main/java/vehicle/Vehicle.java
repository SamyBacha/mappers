package vehicle;

public class Vehicle {

  private final int licensePlate;
  private final String code;
  private final String model;
  private final String type;

  public Vehicle(int licensePlate, String code, String model, String type) {
    this.licensePlate = licensePlate;
    this.code = code;
    this.model = model;
    this.type = type;
  }

  public int getLicensePlate() {
    return licensePlate;
  }

  public String getCode() {
    return code;
  }

  public String getModel() {
    return model;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Vehicle{" + "licensePlate=" + licensePlate + ", code='" + code + '\'' + ", model='" + model + '\'' + ", type='" + type + '\'' + '}';
  }
}
