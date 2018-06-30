package com.newmanuevers;

import java.util.Date;
import java.text.SimpleDateFormat;

class Test {

  public static void main(String[] args) {
    System.out.println("Beginning Test");
    User mealUser = new User("Sean","Newman", "test@test.com", 50);
    //System.out.println(mealUser.getFirstName());

    Meal meal1 = new Meal("Breakfast", "2018-06-29 08:00:00");
     

    MealTracker mt = new MealTracker(mealUser);
    mt.addMeal(meal1);
    System.out.println(mt.getMealCount());

    Foods fd = new Foods("Apple", category.FRUIT, 0, 1, 0);
    Foods fd1 = new Foods("Steak", category.PROTEIN, 1, 5, 12); 
    meal1.addFood((fd));
    meal1.addFood(fd1);
    meal1.viewFoods();

    mt.viewMeals();

  }

}