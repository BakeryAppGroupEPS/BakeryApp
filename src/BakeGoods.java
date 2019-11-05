import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BakeGoods {
    public static void main(String[] args) {

        //Create 15 bake goods
        Main bakeGood1 = new Main();
        Main bakeGood2 = new Main();
        Main bakeGood3 = new Main();
        Main bakeGood4 = new Main();
        Main bakeGood5 = new Main();
        Main bakeGood6 = new Main();
        Main bakeGood7 = new Main();
        Main bakeGood8 = new Main();
        Main bakeGood9 = new Main();
        Main bakeGood10 = new Main();
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
            b.getDisplayText(); //still waiting for method to be created
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
