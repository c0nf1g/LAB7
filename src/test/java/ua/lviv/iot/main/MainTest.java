package ua.lviv.iot.main;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class MainTest {
  @Test
  public void testReadInputText() {
    ByteArrayInputStream in = new ByteArrayInputStream("test string".getBytes());
    String actualString = "test string";

    Assertions.assertEquals(Main.readInputText(in), actualString);
  }
}