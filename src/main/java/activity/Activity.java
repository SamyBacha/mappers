package activity;

public class Activity {

  private final String nom;
  private final String type;

  public Activity(String nom, String type) {
    this.nom = nom;
    this.type = type;
  }

  public String getNom() {
    return nom;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Activity{" + "nom='" + nom + '\'' + ", type='" + type + '\'' + '}';
  }
}
