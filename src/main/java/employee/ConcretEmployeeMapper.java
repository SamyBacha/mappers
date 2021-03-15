//package employee;
//
//import activity.ActivityDto;
//import activity.ActivityMapper;
//import java.util.List;
//
//public class ConcretEmployeeMapper implements GenericMapper<EmployeeDto, Employee>{
//
//
//  @Override
//  public Employee toDomain(EmployeeDto dto) {
//    return new Employee(dto.getFirstName(), dto.getLastName(), dto.getAdminNumber());
//  }
//
//  public GenericMapper<EmployeeDto, Employee> activities() {
//    return dto -> withActivities(this.apply(dto), dto.getActivityDtoList());
//  }
//
//  private static Employee withActivities(Employee emp, List<ActivityDto> activityDtoList) {
//    emp.setActivities(ActivityMapper.toDomain(activityDtoList));
//    return emp;
//  }
//
//}
