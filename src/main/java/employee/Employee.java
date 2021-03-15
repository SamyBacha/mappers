package employee;

import activity.Activity;
import java.util.List;
import vehicle.Vehicle;

public class Employee {

  private final String firstName;
  private final String lastName;
  private final String adminNumber;
  private Vehicle vehicle;
  private List<Activity> activities;

  public Employee(String firstName, String lastName, String adminNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.adminNumber = adminNumber;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAdminNumber() {
    return adminNumber;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }

  public List<Activity> getActivities() {
    return activities;
  }

  @Override
  public String toString() {
    return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", adminNumber='" + adminNumber + '\'' + '}';
  }
}
