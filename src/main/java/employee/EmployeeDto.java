package employee;

import activity.ActivityDto;
import java.util.List;
import vehicle.VehicleDto;

public class EmployeeDto {

  private String firstName;
  private String lastName;
  private String adminNumber;
  private VehicleDto vehicle;
  private List<ActivityDto> activityDtoList;

  public EmployeeDto(String firstName, String lastName, String adminNumber, VehicleDto vehicle, List<ActivityDto> activityDtoList) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.adminNumber = adminNumber;
    this.vehicle = vehicle;
    this.activityDtoList = activityDtoList;
  }

  public VehicleDto getVehicle() {
    return vehicle;
  }

  public void setVehicle(VehicleDto vehicle) {
    this.vehicle = vehicle;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAdminNumber() {
    return adminNumber;
  }

  public void setAdminNumber(String adminNumber) {
    this.adminNumber = adminNumber;
  }

  public List<ActivityDto> getActivityDtoList() {
    return activityDtoList;
  }

  public void setActivityDtoList(List<ActivityDto> activityDtoList) {
    this.activityDtoList = activityDtoList;
  }
}
