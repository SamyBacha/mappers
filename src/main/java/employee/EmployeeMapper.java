package employee;

import activity.ActivityDto;
import activity.ActivityMapper;
import java.util.List;
import vehicle.VehicleDto;
import vehicle.VehicleMapper;

@FunctionalInterface
public interface EmployeeMapper {

  Employee convert(EmployeeDto dto);

  default EmployeeMapper vehicle() {
    return dto -> withVehicle(this.convert(dto), dto.getVehicle());
  }

  default EmployeeMapper activities() {
    return dto -> withActivities(this.convert(dto), dto.getActivityDtoList());
  }

  static EmployeeMapper toDomain() {
    return dto -> new Employee(dto.getFirstName(), dto.getLastName(), dto.getAdminNumber());
  }

  private static Employee withActivities(Employee emp, List<ActivityDto> activityDtoList) {
    emp.setActivities(ActivityMapper.toDomain(activityDtoList));
    return emp;
  }

  private static Employee withVehicle(Employee emp, VehicleDto vehicleDto) {
    emp.setVehicle(VehicleMapper.toDomain(vehicleDto));
    return emp;
  }

}
