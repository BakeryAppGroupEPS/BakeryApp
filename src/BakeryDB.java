import java.util.ArrayList;

public class BakeryDB {
    private ArrayList<BakeGoods> bakesDB;

    public BakeryDB() {
    }//Default constructor

    public ArrayList<BakeGoods> getBakesDB() {
        return bakesDB;
    }

    public void setBakesDB(ArrayList<BakeGoods> bakesDB) {
        this.bakesDB = bakesDB;
    }

    //Array method
    public ArrayList<BakeGoods> check(String answer){
        boolean checker;
        ArrayList<BakeGoods> matched = new ArrayList<>();

            for(BakeGoods b : bakesDB) {
                checker = false;
               for(String d : b.getDietRestriction()){
                   if(d.equalsIgnoreCase(answer)){
                       checker = true;
                       break;

                   }
               }
               if (checker == false){
                   matched.add(b);
               }

            }
            return matched;
    }

    public void print(ArrayList<BakeGoods> matched){
        for(BakeGoods c : matched){
            c.displayText();
        }
    }
}

