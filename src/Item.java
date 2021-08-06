/** The class that will be responsible for holding the different properties of each item. */
public class Item {
    private final String topic;
    private final String question;
    private final String choiceOne;
    private final String choiceTwo;
    private final String choiceThree;
    private final String choiceFour;
    private final String correctChoice;
    private final String imageFilename;
    private boolean isAnswered;
    
    public Item(String topic, String question, String choiceOne, String choiceTwo, String choiceThree,
                String choiceFour, String correctChoice, String imageFilename) {
        this.topic = topic;
        this.question = question;
        this.choiceOne = choiceOne;
        this.choiceTwo = choiceTwo;
        this.choiceThree = choiceThree;
        this.choiceFour = choiceFour;
        this.correctChoice = correctChoice;
        this.imageFilename = imageFilename;
        this.isAnswered = false;
    }

    public void changeIsAnsweredToTrue() {
        this.isAnswered = true;
    }

    public String getTopic() {
        return topic;
    }

    public String getQuestion() {
        return question;
    }

    public String getChoiceOne() {
        return choiceOne;
    }

    public String getChoiceTwo() {
        return choiceTwo;
    }

    public String getChoiceThree() {
        return choiceThree;
    }

    public String getChoiceFour() {
        return choiceFour;
    }

    public String getCorrectChoice() {
        return correctChoice;
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public boolean getIsAnswered() {
        return isAnswered;
    }
}
