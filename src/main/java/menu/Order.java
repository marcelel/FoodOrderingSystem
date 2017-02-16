package menu;

import dishes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by marcel on 16.02.17.
 */
public class Order {

    private MenuCard menuCard = new MenuCard();

    public void askForOrder() {
        System.out.println("What would you like to order?\n1 - Lunch\n2 - Drink");
        int attemps = 0;
        int choice = 0;
        Scanner scanner;
        while (attemps <= 3) {
            if (attemps == 3) {
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
            if (makeChoice(choice)) {
                break;
            }
            else {
                System.out.println("Wrong value, try again!");
            }
        }
    }

    private boolean makeChoice(int choice) {
        if (choice == 1) {
            orderLunch();
            return true;
        }
        if (choice == 2) {
            orderDrink();
            return true;
        }
        return false;
    }

    public MainCourse orderMainCourse() {
        menuCard.displayLunch();
        System.out.println("Which course would you like? (Give name)");
        Scanner scanner = new Scanner(System.in);
        String mainCourseName = scanner.nextLine();
        return menuCard.findMainCourse(mainCourseName);
    }

    public Dessert orderDessert() {
        menuCard.displayDesserts();
        System.out.println("Which dessert would you like? (Give name");
        Scanner scanner = new Scanner(System.in);
        String dessertName = scanner.nextLine();
        return menuCard.findDessert(dessertName);
    }

    public void orderLunch() {
        int attemps = 0;
        Scanner scanner = new Scanner(System.in);
        while (attemps <= 3) {
            if (attemps == 3) {
                System.out.println("Too many attemps");
                break;
            }
            attemps++;
            MainCourse mainCourse = orderMainCourse();
            if (mainCourse == null) {
                System.out.println("This course does not exist, try again");
                continue;
            }
            Dessert dessert = orderDessert();
            if (dessert == null) {
                System.out.println("This desert does not exist, try again!");
                continue;
            }
            if (dessert != null && mainCourse != null) {
                System.out.println(new Lunch(mainCourse, dessert).order());
                break;
            }
        }
    }

    public void orderDrink() {
        int attemps = 0;
        Scanner scanner = new Scanner(System.in);
        menuCard.displayDrinks();
        while (attemps <= 3) {
            if (attemps == 3) {
                System.out.println("Too many attemps");
                break;
            }
            attemps++;
            System.out.println("Which drink would you like? (Give name)");
            String drinkName = scanner.nextLine();
            Drink drink = menuCard.findDrink(drinkName);
            if (drink == null) {
                System.out.println("This drink does not exist, try again!");
                continue;
            }
            else {
                System.out.println(drink.order());
                break;
            }
        }
    }
}
