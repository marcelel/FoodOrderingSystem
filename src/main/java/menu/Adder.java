package menu;

import cuisines.Cuisine;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by marcel on 16.02.17.
 */
public class Adder {

    MenuCard menuCard = new MenuCard();

    public void askToAdd() {
        System.out.println("Would you like to add something?\n1 - Cuisine\n2 - Drink\n3 - Course\n4 - Dessert");
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value!");
            return;
        }
        switch (choice) {
            case 1 : addCuisine();
                break;
            case 2 : addDrink();
                break;
            case 3 : addMainCourse();
                break;
            case 4 : addDessert();
                break;
            default :
                System.out.println("Wrong value!");
        }
    }

    public void addCuisine() {
        System.out.println("Write cuisine name");
        Scanner scanner = new Scanner(System.in);
        String cuisineName = scanner.nextLine();
        menuCard.addCuisine(cuisineName);
    }

    public void addDrink() {
        System.out.println("Write drink name");
        Scanner scanner = new Scanner(System.in);
        String drinkName = scanner.nextLine();
        System.out.println("Write price");
        double drinkPrice;
        try {
            drinkPrice = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value!");
            return;
        }
        menuCard.addDrink(drinkName, drinkPrice);
    }

    private Cuisine checkIfCuisineExists() {
        System.out.println("Write cuisine name");
        Scanner scanner = new Scanner(System.in);
        String cuisineName = scanner.nextLine();
        ArrayList<Cuisine> cuisines = menuCard.getCuisines();
        for (Cuisine c : cuisines) {
            if(c.getName().equals(cuisineName)) {
                return c;
            }
        }
        return null;
    }

    public void addMainCourse() {
        Cuisine cuisine = checkIfCuisineExists();
        if (cuisine == null) {
            System.out.println("Cuisine does not exist");
            return;
        }
        System.out.println("Write course name");
        Scanner scanner = new Scanner(System.in);
        String courseName = scanner.nextLine();
        System.out.println("Write price");
        double coursePrice;
        try {
            coursePrice = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value!");
            return;
        }
        menuCard.addMainCourse(cuisine.getName(), courseName, coursePrice);
    }

    public void addDessert() {
        Cuisine cuisine = checkIfCuisineExists();
        if (cuisine == null) {
            System.out.println("Cuisine does not exist");
            return;
        }
        System.out.println("Write dessert name");
        Scanner scanner = new Scanner(System.in);
        String dessertName = scanner.nextLine();
        System.out.println("Write price");
        double dessertPrice;
        try {
            dessertPrice = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong value!");
            return;
        }
        menuCard.addMainCourse(cuisine.getName(), dessertName, dessertPrice);
    }
}
