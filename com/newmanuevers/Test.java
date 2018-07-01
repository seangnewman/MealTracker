package com.newmanuevers;

import java.util.stream.Stream;

public class Test {

  public static void main(String[] args) {
    System.out.println("Beginning Test");
    User mealUser = new User("Sean","Newman", "test@test.com", 50);
    //System.out.println(mealUser.getFirstName());

    Meal meal1 = new Meal("Breakfast", "2018-06-29 08:00:00");
    Meal meal2 = new Meal("Lunch", "2018-06-29 12:30:00");
    Meal meal3 = new Meal("Dinner", "2018-06-29 07:00:00");

    MealTracker mt = new MealTracker(mealUser);
    mt.addMeal(meal1);
    mt.addMeal(meal2);
    mt.addMeal(meal3);

    System.out.println(mt.getMealCount());

    Foods fd = new Foods("Apple", category.FRUIT, 0, 1, 0);
    Foods fd1 = new Foods("Orange Juice", category.BEVERAGE, 1, 5, 12); 

    Foods fd3 = new Foods("Sandwich", category.PROTEIN, 0, 1, 0);
    Foods fd4 = new Foods("Tea", category.BEVERAGE, 1, 5, 12); 

    Foods fd5 = new Foods("Steak", category.PROTEIN, 0, 1, 0);
    Foods fd6 = new Foods("Beer", category.BEVERAGE, 1, 5, 12); 



    meal1.addFood((fd));
    meal1.addFood(fd1);

    meal2.addFood((fd3));
    meal2.addFood(fd4);

    meal2.addFood((fd5));
    meal2.addFood(fd6);

    meal1.viewFoods();

    mt.viewMeals();
    System.out.println(meal1.getCalories());
       
  
    };
  }

  
