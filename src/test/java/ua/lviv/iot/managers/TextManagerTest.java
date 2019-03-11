package ua.lviv.iot.managers;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class TextManagerTest {

  private TextManager manager = new TextManager();
  private String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
      " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
      "minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
      "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
      "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat" +
      " non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

  private List<String> actualStringList = Arrays.asList("magna", "commodo", "nulla", "est");

  @Test
  public void testHandleText() {
    manager.setStringForHandling(testString);

    Assertions.assertArrayEquals(manager.handleText().toArray(), actualStringList.toArray());
  }

  @Test
  public void testShowResults() {
    manager.setStringForHandling(testString);

    Assertions.assertArrayEquals(manager.showResults(manager.handleText()).toArray(),
        actualStringList.toArray());
  }
}