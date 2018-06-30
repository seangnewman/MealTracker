package com.newmanuevers;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
 
class Meal{
  //Meal "has-a" relationship with Foods
  //ie Meal contains 1 or mor foo

  private ArrayList<Foods> food = new ArrayList<>();
  private String mealname;
  private Date mealDate;

  Meal(String name, String timeOfMeal){
    this.mealname = name;
    this.mealDate = setDate(timeOfMeal);
  }
  
  public void addFood(Foods food){
    this.food.add(food);
  }

  public String getName(){
    return this.mealname;
  }

  public String getDate(){
    String datePattern = "yyyy-MM-dd HH:mm:ss";
    SimpleDateFormat mealFormat = new SimpleDateFormat(datePattern);
    return mealFormat.format(this.mealDate);
  }

  private Date setDate(String stringDate){
     
    Date tempDate = new Date();
    String datePattern = "yyyy-MM-dd HH:mm:ss";
    try{
      SimpleDateFormat mealFormat = new SimpleDateFormat(datePattern);
      tempDate = mealFormat.parse(stringDate);
      
    }catch (ParseException e) {e.printStackTrace();} 
    
     
    return tempDate ;
  }

  public double getCalories(){
    double calorieCount = 0;
    for(Foods food: this.food){
      calorieCount += food.getCalories();
    }
    return calorieCount;
  }

  public double getFat(){
    double fatCount = 0;
    for(Foods food: this.food){
      fatCount += food.getFat();
    }
    return fatCount;
  }

  public double getCarbohydrates(){
    double carbCount = 0;
    for(Foods food: this.food){
      carbCount += food.getCarbohydrates();
    }
    return carbCount;
  }

  public double getProtein(){
    double proteinCount = 0;
    for(Foods food: this.food){
      proteinCount += food.getProtein();
    }
    return proteinCount;
  }
  
  public void viewFoods(){
    //Return name of all foods in the meal plan
    for(Foods food : this.food){
      System.out.println(food.getName());
    }
  }

  public boolean consumed(){
    boolean FRUIT = false;
    boolean VEGETABLE = false;
    boolean PROTEIN = false;
    boolean FAT = false;
    boolean BEVERAGE = false;
    
    for (Foods food : this.food){
      switch(food.getCategory()){
        case FRUIT:
          FRUIT = true;
          break;
        case VEGETABLE:
          VEGETABLE = true;
          break;
        case PROTEIN:
          PROTEIN = true;
          break;
        case FAT:
          FAT = true;
          break;
        case BEVERAGE:
          BEVERAGE = true;
          break;
          
        default:
          break;
      }
    }
    

    return FRUIT && VEGETABLE && PROTEIN && FAT && BEVERAGE; 
  }


}