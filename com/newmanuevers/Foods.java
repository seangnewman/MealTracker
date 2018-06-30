package com.newmanuevers;

import java.util.ArrayList;
import java.util.Random;


class Foods{
  private double calories;
  private double fat;
  private double carbohydrates;
  private double protein;
  private String name;
  private category type;

  private ArrayList <category> categories = new ArrayList<>();

  Foods(String  name, 
        category type,
         
        double fat, 
        double carbohydrates,
        double protein
        ){
    this.name = name;
    this.type = type;
     
    this.fat = fat;
    this.carbohydrates = carbohydrates;
    this.protein = protein;
    this.calories = deriveCalories(fat, carbohydrates, protein);
     
  }
  
  public String getName(){
    return this.name;
  }

  public double getCalories(){
    return this.calories;
  }
  public double getFat(){
    return this.fat;
  }
  public double getCarbohydrates(){
    return this.carbohydrates;
  }
  public double getProtein(){
    return this.protein;
  }

  public category getCategory(){
    return this.type;
  }

  public ArrayList<category> getCategories(){
    return this.categories;
  }

  public void addCategory(category cat ){
     this.categories.add(cat);
  }

  private static double deriveCalories( double carbohydrates, double fat, double protein){
      return   randomMultiple() * carbohydrates + randomMultiple() * fat + randomMultiple() * protein;  
  }

  private static double randomMultiple(){
    int floor = 0;
    int ceiling = 100;
    Random rand = new Random();
    return  rand.nextInt((ceiling - floor) + 1) + floor;
  }
  
}


