package employee;

import static org.assertj.core.api.Assertions.assertThat;

import activity.ActivityDto;
import java.util.List;
import org.junit.jupiter.api.Test;
import vehicle.VehicleDto;

class MapperTest {

  List<ActivityDto> activityDtoList = List.of(new ActivityDto("Foot", "equipe/plein air"), new ActivityDto("IT", "Pro"));
  VehicleDto vehicleDto = new VehicleDto(1920399, "P123", "Peugeot", "Sport");
  EmployeeDto employeeDto = new EmployeeDto("Samy", "BACHA", "A330", vehicleDto, activityDtoList);

  @Test
  void should_convert_without_vehicle() {
    Employee employee = EmployeeMapper.toDomain().apply(employeeDto);

    assertThat(employee).isNotNull();
    assertThat(employee.getVehicle()).isNull();
    assertThat(employee.getActivities()).isNull();
    assertThat(employee.toString()).hasToString(employeeDto.toString());
  }

  @Test
  void should_convert_with_vehicle() {
    Employee employee = EmployeeMapper.toDomain().vehicle().apply(employeeDto);

    assertThat(employee).isNotNull();
    assertThat(employee.getVehicle()).isNotNull();
    assertThat(employee.getActivities()).isNull();
    assertThat(employee.toString()).hasToString(employeeDto.toString());
    assertThat(employee.getVehicle().toString()).hasToString(employeeDto.getVehicle().toString());

  }

  @Test
  void should_convert_with_activities() {
    Employee employee = EmployeeMapper.toDomain().activities().apply(employeeDto);

    assertThat(employee).isNotNull();
    assertThat(employee.getActivities()).isNotNull().isNotEmpty();
    assertThat(employee.getVehicle()).isNull();
    assertThat(employee.toString()).hasToString(employeeDto.toString());
    assertThat(employee.getActivities().toString()).hasToString(employeeDto.getActivities().toString());

  }

  @Test
  void should_convert_with_activities_and_vehicles() {
    Employee employee = EmployeeMapper.toDomain().vehicle().activities().apply(employeeDto);

    assertThat(employee).isNotNull();
    assertThat(employee.getActivities()).isNotNull().isNotEmpty();
    assertThat(employee.getVehicle()).isNotNull();
    assertThat(employee.toString()).hasToString(employeeDto.toString());
    assertThat(employee.getActivities().toString()).hasToString(employeeDto.getActivities().toString());

  }

//  @Test
//  public void shouldChainDiscounters() {
//     EmployeeMapper.withVehicle().andThen(withActivities()).apply(employeeDto);
//  }


  //  @Test
  //  void should_convert_with_activities_and_vehicles2() {
  //    List<EmployeeMapper> mappers = List.of(withVehicle(), withActivities());
  //
  //    final EmployeeMapper combinedMappers = mappers
  //        .stream()
  //        .reduce(v -> v, Function::compose);
  //
  //    Employee employee = combinedMappers.apply(employeeDto);
  //
  //    assertThat(employee).isNotNull();
  //    assertThat(employee.getActivities()).isNotNull().isNotEmpty();
  //    assertThat(employee.getVehicle()).isNotNull();
  //  }

}
