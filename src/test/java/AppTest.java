import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void coinCombo_shouldGiveCoinCombo75Cents_3Quarters() {
    App app = new App();
    String coinResult = "Your change is 3 quarters";
    assertEquals(coinResult, app.coinCombo("75"));
  }
}
