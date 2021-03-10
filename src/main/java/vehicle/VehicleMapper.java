package vehicle;

public interface VehicleMapper {

  static Vehicle toDomain(VehicleDto dto) {
    return new Vehicle(dto.getLicensePlate(), dto.getCode(), dto.getModel(), dto.getType());
  }
}
