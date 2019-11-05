import java.util.ArrayList;

public class BakeryDB {
    private ArrayList<Main> bakesDB;

    public BakeryDB() {
    }//Default constructor

    public ArrayList<Main> getBakesDB() {
        return bakesDB;
    }

    public void setBakesDB(ArrayList<Main> bakesDB) {
        this.bakesDB = bakesDB;
    }
}
