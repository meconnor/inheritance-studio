public class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    public TrueFalseQuestion(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean isCorrect(String answer) {
        return Boolean.parseBoolean(answer) == correctAnswer;
    }

    @Override
    public void displayOptions() {
        System.out.println("True");
        System.out.println("False");
    }
}
