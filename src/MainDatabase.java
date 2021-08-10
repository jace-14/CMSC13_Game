import java.util.ArrayList;

/** The main database class that contains all the Item objects. */
public class MainDatabase {
    /** The arraylist object that contains all the item objects. */
    public ArrayList<Item> database = null;

    public MainDatabase(String fileLocationOfExcelFile) {
        try {
            database = ExcelFileToArrayList.convert(fileLocationOfExcelFile);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** Dummy method. Showcases choose method. */
    public void go() {
        Item temporaryItem = RandomizedItemChooser.choose(this.database, "Theoretical");
        System.out.println(temporaryItem.getTopic() + "\n" + temporaryItem.getQuestion() + "\n" +
                temporaryItem.getCorrectChoice());
    }

}
