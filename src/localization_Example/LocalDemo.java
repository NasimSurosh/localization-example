package localization_Example;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
  public static void greetInLocalLanguage(Locale locale) {
    ResourceBundle message = ResourceBundle.getBundle("localization_Example/messages", locale);
    String greeting = message.getString("greeting");
    System.out.println(greeting);
    
  }

  public static void main(String[] args) {
    
    Locale english = new Locale("en","US");    
    Locale spanish = new Locale("es","ES");
    Locale german = new Locale("ge","GE");
    
    greetInLocalLanguage(english);
    greetInLocalLanguage(spanish);
    greetInLocalLanguage(german);

  }

}
