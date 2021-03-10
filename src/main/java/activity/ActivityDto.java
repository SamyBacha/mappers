package activity;

public class ActivityDto {

  private String nom;
  private String type;

  public ActivityDto(String nom, String type) {
    this.nom = nom;
    this.type = type;
  }

  public String getNom() {
    return nom;
  }

  public String getType() {
    return type;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setType(String type) {
    this.type = type;
  }
}
