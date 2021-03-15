package employee;

import activity.ActivityDto;
import activity.ActivityMapper;
import java.util.List;
import java.util.function.Function;
import vehicle.VehicleDto;
import vehicle.VehicleMapper;

//@FunctionalInterface
public interface EmployeeMapper extends Function<EmployeeDto, Employee> {

  static EmployeeMapper toDomain() {
    return dto -> new Employee(dto.getFirstName(), dto.getLastName(), dto.getAdminNumber());
  }

  default EmployeeMapper activities() {
    return dto -> withActivities(this.apply(dto), dto.getActivities());
  }

  private static Employee withActivities(Employee emp, List<ActivityDto> activityDtoList) {
    emp.setActivities(ActivityMapper.toDomain(activityDtoList));
    return emp;
  }

  default EmployeeMapper vehicle() {
    return dto -> withVehicle(this.apply(dto), dto.getVehicle());
  }

  private static Employee withVehicle(Employee emp, VehicleDto vehicleDto) {
    emp.setVehicle(VehicleMapper.toDomain(vehicleDto));
    return emp;
  }


}
