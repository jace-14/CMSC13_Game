import java.util.ArrayList;

/** Chooses a random item among the different indexes, given the topic. */
public class RandomizedItemChooser {
    /** Chooses a random item in the database given the topic.*/
    public static Item choose(ArrayList<Item> database, String topic) {
        int min = 0;
        int max = IndexFetcher.fetch(database, topic).size();
        int randomIndex = (int) (Math.random() * (max - min)) + min;
        int randomTrueIndex = IndexFetcher.fetch(database, topic).get(randomIndex);
        database.get(randomTrueIndex).changeIsAnsweredToTrue();
        return database.get(randomTrueIndex);
    }
}
