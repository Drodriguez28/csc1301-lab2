

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RobotDishwasher {

    public static void main(String[] args) {

        String dishes = "dishRed dishGreen dishBlue";
        //String dishes = "dish1 dish2 dish3 dish4 dish5 dish6 dish7";

        Scanner sc = new Scanner (dishes);
        int counter = 0;
        while (sc.hasNext()){
        
            //String dish = sc.next();
            //loadDish(dish);
            System.out.println("I Loaded the dish: " + sc.next());
            counter = counter + 1;

        }
        System.out.println("Number of dishes loaded: " + counter);
        
    }

    public static void loadDish(String dish) {
        System.out.println("I Loaded the dish: " + dish);
    }
}