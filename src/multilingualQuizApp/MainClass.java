package multilingualQuizApp;

import java.util.Locale;
import java.util.ResourceBundle;

class QuizService{
  ResourceBundle resourceBundle;
  
  public QuizService(Locale locale) {
    resourceBundle = ResourceBundle.getBundle("multilingualQuizApp/quiz",locale);
  }
  public String getQuistion(int question) {
    return resourceBundle.getString("question"+ question);
  }
  public String getAnswer(int question) {
    return resourceBundle.getString("answer"+ question);
  }
  
}

public class MainClass {
  public static void display(QuizService quiz, String language, int questionNumber) {
    
    System.out.println(language +" Quiz");
      String question = quiz.getQuistion(questionNumber);
      String answer = quiz.getAnswer(questionNumber);
      System.out.println("Question is : " +question +"\nAnswer is : " + answer+ "\n");
    
  }
  public static void main(String[] args) {
    QuizService english = new QuizService(new Locale("en","US"));
    QuizService espanish = new QuizService(new Locale("es","ES"));
    QuizService german = new QuizService(new Locale("ge","GE"));
    
    
    display(english, "English",1);
    display(espanish, "Espanish",2);
    display(german, "German",3);
    

  }

}
