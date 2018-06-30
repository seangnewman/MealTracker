package com.newmanuevers;
import java.util.ArrayList;
 
class MealTracker{
  // Meal Tracker contains a number of meals
  // Again.. a "has-a " relationship
  private ArrayList<Meal> meals = new ArrayList<>(); 

  // Meal Tracker contains a number of Users
  // Again.. a "has-a " relationship
  private User mealUser;
    
  MealTracker(User user){
    this.mealUser = user;
  }

  public int getMealCount(){
     return this.meals.size();
  }

  public double getAdherence(){
    int count = 0;
    for(Meal meal: this.meals){
      if(meal.consumed()){
        count += 1;
      }
    }

    return (double)(count/this.meals.size()) * 100;
  }

  public boolean isOnTrack(){
    // check if current adherance greater than or equal to
    return this.getAdherence() >= this.mealUser.getTargetAdherence();
  }

  public void addMeal(Meal newMeal){
    this.meals.add(newMeal);
  }

  public void viewMeals(){
    for(Meal meals: this.meals){
      System.out.println(meals.getName());
    }
  }
}