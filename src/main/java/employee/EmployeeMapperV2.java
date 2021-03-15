package employee;

import activity.ActivityDto;
import activity.ActivityMapper;
import java.util.List;
import java.util.function.Function;
import vehicle.VehicleDto;
import vehicle.VehicleMapper;

@FunctionalInterface
public interface EmployeeMapperV2 extends Function<EmployeeDto, Employee> {

  static EmployeeMapperV2 toDomain() {
    return dto -> new Employee(dto.getFirstName(), dto.getLastName(), dto.getAdminNumber());
  }


  static EmployeeMapperV2 vehicle() {
    return  dto -> withVehicle(toDomain().apply(dto), dto.getVehicle());
  }

  static EmployeeMapperV2 activities() {
    return  dto -> withActivities(toDomain().apply(dto), dto.getActivities());
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
