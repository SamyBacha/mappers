package employee;

import java.util.function.Function;

public interface GenericMapper<T, S> { //extends Function<T, S> {

  GenericMapper<T, S> toDomain();

}
