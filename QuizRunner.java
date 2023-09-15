import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.addQuestion(new MultipleChoiceQuestion("What is 2 + 2?", new ArrayList<>(Arrays.asList("A. 1", "B. 2", "C. 3", "D. 4")), 3));
        quiz.addQuestion(new TrueFalseQuestion("Is Java a programming language?", true));
        // Add more questions

        quiz.runQuiz();
    }
}
