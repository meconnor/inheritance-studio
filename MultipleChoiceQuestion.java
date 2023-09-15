import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
    private ArrayList<String> options;
    private int correctOptionIndex;

    public MultipleChoiceQuestion(String text, ArrayList<String> options, int correctOptionIndex) {
        super(text);
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    @Override
    public boolean isCorrect(String answer) {
        char selectedOption = answer.toUpperCase().charAt(0);
        char correctOption = (char) ('A' + correctOptionIndex);

        return selectedOption == correctOption;
    }

    @Override
    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            char optionLabel = (char) ('A' + i);
            System.out.println(optionLabel + ". " + options.get(i));
        }
    }
}

