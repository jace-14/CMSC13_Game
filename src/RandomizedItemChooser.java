import java.util.ArrayList;

/** Chooses a random item among the different indexes, given the topic and category. */
public class RandomizedItemChooser {
    /** Chooses a random item in the database given the topic and category. */
    public static Item choose(ArrayList<Item> database, String topic, String category) {
        int min = 0;
        int max = IndexFetcher.fetch(database, topic, category).size();
        int randomIndex = (int) (Math.random() * (max - min)) + min;
        int randomTrueIndex = IndexFetcher.fetch(database, topic, category).get(randomIndex);
        database.get(randomTrueIndex).changeIsAnsweredToTrue();
        return database.get(randomTrueIndex);
    }

    /** Chooses a random item in the database given the difficulty. */
    public static Item choose(ArrayList<Item> database, String category) {
        int min = 0;
        int max = IndexFetcher.fetch(database, category).size();
        int randomIndex = (int) (Math.random() * (max - min)) + min;
        int randomTrueIndex = IndexFetcher.fetch(database, category).get(randomIndex);
        database.get(randomTrueIndex).changeIsAnsweredToTrue();
        return database.get(randomTrueIndex);
    }
}
