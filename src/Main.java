import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BakeGoods bakeGood = new BakeGoods();
        bakeGood.displayWelcomeText(); //display welcome message

        //Create 15 bake goods
        BakeGoods bakeGood1 = new BakeGoods("Naked berry", 27.00, "11/06/19", new String[]{"gluten", "dairy", "eggs"}, 1);
        BakeGoods bakeGood2 = new BakeGoods("Banana bread", 5.95, "11/06/19",  new String[]{"soy", "tree nuts", "sesame"}, 5);
        BakeGoods bakeGood3 = new BakeGoods("Multi grain white bread", 10.95, "11/11/19",  new String[]{"eggs","soy","tree nuts"}, 5);
        BakeGoods bakeGood4 = new BakeGoods("Blueberry6-pack of muffins", 16.50, "11/11/19",  new String[]{"sesame", "dairy", "soy"}, 3);
        BakeGoods bakeGood5 = new BakeGoods("Large hamburger buns", 5.00, "11/11/19",  new String[]{"sesame", "gluten", "dairy"}, 12);
        BakeGoods bakeGood6 = new BakeGoods("Cinnamon Bread", 10.95, "11/19/19", new String[]{"gluten"}, 2);
        BakeGoods bakeGood7 = new BakeGoods("Soft Crust Pizza", 6.95, "1/16/20", new String[]{"peanuts", "tree nuts", "sesame"}, 5);
        BakeGoods bakeGood8 = new BakeGoods("Dozen Savory Empanadas", 39.00, "11/06/19", new String[]{"sesame", "gluten", "dairy"}, 4);
        BakeGoods bakeGood9 = new BakeGoods("Peppermint Velvet Roll", 36.95, "11/06/19", new String[]{"tree nuts"}, 1);
        BakeGoods bakeGood10 = new BakeGoods("Rosette One Cake", 32.00, "11/06/19", new String[]{"gluten", "eggs"}, 1);
        BakeGoods bakeGood11 = new BakeGoods("Golden flower cake", 64.00, "11/06/19",new String[]{"gluten" , "dairy"}, 1);
        BakeGoods bakeGood12 = new BakeGoods("3 ghost cake", 32.00, "11/06/19", new String[]{"gluten" , "dairy", "eggs"}, 2);
        BakeGoods bakeGood13 = new BakeGoods("Casino cake", 54.00, "11/08/19", new String[]{"gluten" , "dairy", "eggs"}, 1);
        BakeGoods bakeGood14 = new BakeGoods("Little mermaid cake", 25.00, "11/06/19", new String[]{"gluten" , "dairy"}, 3);
        BakeGoods bakeGood15 = new BakeGoods("Soccer ball cake", 49.00, "11/06/19", new String[]{"eggs"}, 2);

        //Ask the user for diet restrictions
        Scanner key = new Scanner(System.in);
        System.out.println();
        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction: ");
        System.out.println("To see a list of all our foods, please type all");
        String answer = key.next();



        //********** Calls the arrayList from the BakeryDB class *******************//
        ArrayList<BakeGoods> bakesArrayList = new ArrayList<>();
        Collections.addAll(bakesArrayList, bakeGood1, bakeGood2, bakeGood3, bakeGood4, bakeGood5
                , bakeGood6, bakeGood7, bakeGood8, bakeGood9, bakeGood10, bakeGood11, bakeGood12
                , bakeGood13, bakeGood14, bakeGood15);
        BakeryDB bakesDB = new BakeryDB();
        bakesDB.setBakesDB(bakesArrayList);

        if(answer.equalsIgnoreCase("all")) {
      for (BakeGoods b : bakesDB.getBakesDB()){
           b.displayText(); //still waiting for method to be created
       }
        }

        //***********************************************************************//
        ArrayList<BakeGoods> x = bakesDB.check(answer);
        bakesDB.print(x);





    }
}
