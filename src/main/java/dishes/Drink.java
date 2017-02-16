package dishes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by marcel on 15.02.17.
 */
public class Drink extends Dish {

    private boolean iceCubes;

    private boolean lemon;

    public Drink(String name, double price) {
        super(name, price);
        iceCubes = false;
        lemon = false;
    }

    public boolean isIceCubes() {
        return iceCubes;
    }

    public boolean isLemon() {
        return lemon;
    }

    public void ask() {
        System.out.println("Would like ice cube, lemon, or both?\n1 - ice cube\n2 - lemon\n3 - both");
        int attemps = 0;
        int choice = 0;
        Scanner scanner;
        while (attemps <= 3) {
            if (attemps == 3){
                System.out.println("Too many attemps!");
                break;
            }
            attemps++;
            scanner = new Scanner(System.in);
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Try again!");
                continue;
            }
            if(makeChoice(choice)){
                break;
            }
        }
    }

    public boolean makeChoice (int choice) {
        if (choice == 1){
            iceCubes = true;
            return true;
        }
        if (choice == 2 ){
            lemon = true;
            return true;
        }
        if (choice == 3){
            lemon = true;
            iceCubes = true;
            return true;
        }
        else {
            System.out.println("Try again!");
            return false;
        }
    }

    @Override
    public String order(){
        ask();
        return super.order();
    }
}
