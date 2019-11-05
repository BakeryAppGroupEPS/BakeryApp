import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BakeGoods {
    public static void main(String[] args) {

        //Create 15 bake goods
        Main bakeGood1 = new Main("naked berry", 27.00, "11/06/19", "gluten, dairy, eggs", 1);
        Main bakeGood2 = new Main("banana bread", 5.95, "11/06/19", "soy, tree nuts, sesame", 5);
        Main bakeGood3 = new Main("multi grain white bread", 10.95, "11/11/19", "eggs,say,tree nuts", 5);
        Main bakeGood4 = new Main("blueberry6-pack of muffins", 16.50, "11/11/19", "sesame, dairy, soy", 3);
        Main bakeGood5 = new Main("large hamburger buns", 5.00, "11/11/19", "sesame, gluten, dairy", 12);
        Main bakeGood6 = new Main("Cinnamon Bread", 10.95, "11/19/19", "gluten, dairy, eggs", 2);
        Main bakeGood7 = new Main("Soft Crust Pizza", 6.95, "1/16/20", "peanuts, tree nuts, sesame", 5);
        Main bakeGood8 = new Main("Dozen Savory Empanadas", 39.00, "11/06/19", "sesame, gluten, dairy", 4);
        Main bakeGood9 = new Main("Peppermint Velvet Roll", 36.95, "11/06/19", "tree nuts, peanuts, eggs", 1);
        Main bakeGood10 = new Main("Rosette One Cake", 32.00, "11/06/19", "gluten, eggs, sesame", 1);
        Main bakeGood11 = new Main();
        Main bakeGood12 = new Main();
        Main bakeGood13 = new Main();
        Main bakeGood14 = new Main();
        Main bakeGood15 = new Main();

        //********** Calls the arrayList from the BakeryDB class *******************//
        ArrayList<Main> bakesArrayList = new ArrayList<>();
        Collections.addAll(bakesArrayList, bakeGood1, bakeGood2, bakeGood3, bakeGood4, bakeGood5
                , bakeGood6, bakeGood7, bakeGood8, bakeGood9, bakeGood10, bakeGood11, bakeGood12
                , bakeGood13, bakeGood14, bakeGood15);
        BakeryDB bakesDB = new BakeryDB();
        bakesDB.setBakesDB(bakesArrayList);
        for (Main b : bakesDB.getBakesDB()){
            b.displayText(); //still waiting for method to be created
        }
        //***********************************************************************//

        //Ask the user for diet restrictions
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to the Brookley's Better Bakery App! \n" +
                "We contain peanut, gluten, soy and dairy in our products. \n");
        System.out.println("To search for foods that you can eat, please enter the name of the diet restriction: \n" +
                "To see a list of all our foods, please type \"all\".");
        String answer = key.nextLine();

    }
}
