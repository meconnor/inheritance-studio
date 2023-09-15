import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<>(); // Use ArrayList

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getText());
            question.displayOptions();
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (question.isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect!\n");
            }
        }

        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
    }
}
