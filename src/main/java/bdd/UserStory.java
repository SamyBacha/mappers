package bdd;

import java.util.ArrayList;
import java.util.List;

public class UserStory {
  String title;
  List<Rule> rules = new ArrayList<>();

  public UserStory(String title) {
    this.title = title;
  }

  public void add(Rule rule) {
    rules.add(rule);
  }
}
