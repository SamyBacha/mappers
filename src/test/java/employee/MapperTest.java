package employee;

import activity.ActivityDto;
import java.util.List;
import org.junit.jupiter.api.Test;
import vehicle.VehicleDto;

import static org.assertj.core.api.Assertions.*;

class MapperTest {

  List<ActivityDto> activityDtoList = List.of(new ActivityDto("Foot", "equipe/plein air"), new ActivityDto("IT", "Pro"));
  VehicleDto vehicleDto = new VehicleDto(1920399, "P123", "Peugeot", "Sport");
  EmployeeDto employeeDto = new EmployeeDto("Samy", "BACHA", "A330", vehicleDto, activityDtoList);

  @Test
  void should_convert_without_vehicle() {
    Employee employee = EmployeeMapper.toDomain().convert(employeeDto);

    assertThat(employee).isNotNull();
    assertThat(employee.getVehicle()).isNull();
    assertThat(employee.getActivities()).isNull();
  }

  @Test
  void should_convert_with_vehicle() {
    Employee employee = EmployeeMapper.toDomain().vehicle().convert(employeeDto);

    assertThat(employee).isNotNull();
    assertThat(employee.getVehicle()).isNotNull();
    assertThat(employee.getActivities()).isNull();
  }

  @Test
  void should_convert_with_activities() {
    Employee employee = EmployeeMapper.toDomain().activities().convert(employeeDto);

    assertThat(employee).isNotNull();
    assertThat(employee.getActivities()).isNotNull().isNotEmpty();
    assertThat(employee.getVehicle()).isNull();
  }

  @Test
  void should_convert_with_activities_and_vehicles() {
    Employee employee = EmployeeMapper
        .toDomain()
        .vehicle()
        .activities()
        .convert(employeeDto);

    assertThat(employee).isNotNull();
    assertThat(employee.getActivities()).isNotNull().isNotEmpty();
    assertThat(employee.getVehicle()).isNotNull();
  }
}
