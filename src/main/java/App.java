import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

  public static String coinCombo(String userInput) {
    Integer userCoins = Integer.parseInt(userInput);

    Integer quarters = 0;

    while (userCoins > 24) {
      userCoins -= 25;
      quarters++;
    }

    return String.format("Your change is %d quarters", quarters);
  }
}
