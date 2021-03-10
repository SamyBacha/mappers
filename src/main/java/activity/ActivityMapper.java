package activity;

import java.util.List;
import java.util.stream.Collectors;

public interface ActivityMapper {

  static List<Activity> toDomain(List<ActivityDto> dtos) {
    return dtos.stream().map(ActivityMapper::toDomain).collect(Collectors.toList());
  }

  static Activity toDomain(ActivityDto dto) {
    return new Activity(dto.getNom(), dto.getType());
  }
}
