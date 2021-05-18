package bdd;

public class Scenario {
  private static final String IAM = " I am a ";
  private static final String GIVEN = " Given ";
  private static final String AND = " And ";
  private static final String WHEN = " When ";
  private static final String THEN = " Then ";

  public static void main(String[] args) {
    Actor actor = new Actor("Client DVD");
    UserStory userStory = new UserStory("Louer DVD");
    userStory.add(new Rule("has account", Type.BOOLEAN));
    userStory.add(new Rule("age > 18", Type.BOOLEAN));

    Scenario scenario = new Scenario();
    scenario.print(actor, userStory);
  }

  private void print(Actor actor, UserStory userStory) {
    System.out.println(GIVEN + IAM + actor.name);
    userStory.rules.forEach( rule ->
        System.out.println(AND + rule.description + rule.type.isBoolean())
    );

  }
}
