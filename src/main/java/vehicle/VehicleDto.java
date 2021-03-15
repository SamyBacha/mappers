package vehicle;

public class VehicleDto {

  private int licensePlate;
  private String code;
  private String model;
  private String type;

  public VehicleDto(int licensePlate, String code, String model, String type) {
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

  public void setLicensePlate(int licensePlate) {
    this.licensePlate = licensePlate;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Vehicle{" + "licensePlate=" + licensePlate + ", code='" + code + '\'' + ", model='" + model + '\'' + ", type='" + type + '\'' + '}';
  }
}
