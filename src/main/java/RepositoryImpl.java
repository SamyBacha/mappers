//import employee.Employee;
//import employee.EmployeeDto;
//import employee.EmployeeMapper;
//
//public class RepositoryImpl implements Repository{
//
//  private EmployeeDto getFromBdd(String adminNumber) {
//    return new EmployeeDto("Samy", "BACHA", "ofkeofke", null, null);
//  }
//
//  @Override
//  public Employee findByAdminNumber(String adminNumber) {
//    EmployeeDto employeeDto = getFromBdd(adminNumber);
//    return EmployeeMapper
//        .toDomain()
//        .convert(employeeDto);
//  }
//
//  @Override
//  public Employee withVehicule(Employee) {
//    EmployeeDto employeeDto = getFromBdd("adminNumber");
//    return EmployeeMapper
//        .toDomain()
//        .vehicle()
//        .convert(employeeDto);
//  }
//
//  @Override
//  public Employee get() {
//    return null;
//  }
//}
