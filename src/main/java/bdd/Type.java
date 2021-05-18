package bdd;

public enum Type {
  BOOLEAN, MULTIPLE;

  public boolean isBoolean() {
    return this == BOOLEAN;
  }
}
