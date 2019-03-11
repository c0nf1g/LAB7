package ua.lviv.iot.main;

import ua.lviv.iot.managers.TextManager;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    TextManager manager = new TextManager();
    manager.setStringForHandling(readInputText(System.in));
    manager.showResults(manager.handleText());
  }

  public static String readInputText(InputStream in) {
    Scanner scanner = new Scanner(in);
    System.out.println("Enter the text: ");

    return scanner.nextLine();
  }
}
