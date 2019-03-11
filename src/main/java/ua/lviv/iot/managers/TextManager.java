package ua.lviv.iot.managers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextManager {
  private String stringForHandling;

  public List<String> handleText() {
    List<String> wordList = new ArrayList<String>();
    Pattern pattern = Pattern.compile("([A-Za-z]*\\s)([A-Za-z]*([.?!]))");
    Matcher matcher = pattern.matcher(stringForHandling);

    while(matcher.find()) {
      String result = matcher.group(1);
      wordList.add(result.trim());
    }

    return wordList;
  }

  public List<String> showResults(List<String> wordList) {
    for(String word : wordList) {
      System.out.println(word);
    }

    return wordList;
  }

  public void setStringForHandling(String stringForHandling) {
    this.stringForHandling = stringForHandling;
  }
}
