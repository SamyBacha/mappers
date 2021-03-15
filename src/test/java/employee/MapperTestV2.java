//package employee;
//
//import activity.ActivityDto;
//import discount.Discounter;
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.function.Function;
//import org.junit.jupiter.api.Test;
//import vehicle.VehicleDto;
//
//import static discount.Discounter3.newYear;
//import static employee.EmployeeMapperV2.activities;
//import static org.assertj.core.api.Assertions.*;
//
//class MapperTestV2 {
//
//  List<ActivityDto> activityDtoList = List.of(new ActivityDto("Foot", "equipe/plein air"), new ActivityDto("IT", "Pro"));
//  VehicleDto vehicleDto = new VehicleDto(1920399, "P123", "Peugeot", "Sport");
//  EmployeeDto employeeDto = new EmployeeDto("Samy", "BACHA", "A330", vehicleDto, activityDtoList);
//
//  @Test
//  void should_convert_without_vehicle() {
//    Employee employee = EmployeeMapperV2.toDomain().apply(employeeDto);
//
//    assertThat(employee).isNotNull();
//    assertThat(employee.getVehicle()).isNull();
//    assertThat(employee.getActivities()).isNull();
//  }
//
//  @Test
//  void should_convert_with_vehicle() {
//    Employee employee = EmployeeMapperV2.vehicle().apply(employeeDto);
//
//    assertThat(employee).isNotNull();
//    assertThat(employee.getVehicle()).isNotNull();
//    assertThat(employee.getActivities()).isNull();
//  }
//
//  @Test
//  void should_convert_with_activities() {
//    Employee employee = activities().apply(employeeDto);
//
//    assertThat(employee).isNotNull();
//    assertThat(employee.getActivities()).isNotNull().isNotEmpty();
//    assertThat(employee.getVehicle()).isNull();
//  }
//
//  @Test
//  void should_convert_with_activities_and_vehicles() {
//    final Function<EmployeeDto, Employee> combined = EmployeeMapperV2
//        .vehicle()
//        .andThen(newYear());
//
//    assertThat(employee).isNotNull();
//    assertThat(employee.getActivities()).isNotNull().isNotEmpty();
//    assertThat(employee.getVehicle()).isNotNull();
//  }
//
//
//
//}
