/** The class that will be responsible for holding the different properties of each item. */
public class Item {
    private final String topic;
    private final String question;
    private final String choiceOne;
    private final String choiceTwo;
    private final String choiceThree;
    private final String choiceFour;
    private final String correctChoice;
    private final String questionImageFilename;
    private final String choiceAImageFilename;
    private final String choiceBImageFilename;
    private final String choiceCImageFilename;
    private final String choiceDImageFilename;
    private final String category;
    private boolean isAnswered;
    
    public Item(String topic, String question, String choiceOne, String choiceTwo, String choiceThree,
                String choiceFour, String correctChoice, String questionImageFilename,
                String choiceAImageFilename, String choiceBImageFilename, String choiceCImageFilename,
                String choiceDImageFilename, String category) {
        this.topic = topic;
        this.question = question;
        this.choiceOne = choiceOne;
        this.choiceTwo = choiceTwo;
        this.choiceThree = choiceThree;
        this.choiceFour = choiceFour;
        this.correctChoice = correctChoice;
        this.questionImageFilename = questionImageFilename;
        this.choiceAImageFilename = choiceAImageFilename;
        this.choiceBImageFilename = choiceBImageFilename;
        this.choiceCImageFilename = choiceCImageFilename;
        this.choiceDImageFilename = choiceDImageFilename;
        this.category = category;
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

    public String getQuestionImageFilename() {
        return questionImageFilename;
    }
    
    public String getChoiceAImageFilename() {
        return choiceAImageFilename;
    }
    
    public String getChoiceBImageFilename() {
        return choiceBImageFilename;
    }
    
    public String getChoiceCImageFilename() {
        return choiceCImageFilename;
    }
    
    public String getChoiceDImageFilename() {
        return choiceDImageFilename;
    }

    public boolean getIsAnswered() {
        return isAnswered;
    }
    
    public String getCategory() {
        return category;
    }
}
