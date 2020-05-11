package com.example.calcalories.activity;

public class Recipes {

    private String RecipeName;
    private String RecipeIngredients;
    private String RecipeMethodTitle;
    private String Recipe;
    private int Thumbnail;

    public Recipes (String name, String recipeIngredient, String recipemethodTitle, String recipe,int thumbnail){

        RecipeName= name;
        RecipeIngredients = recipeIngredient;
        RecipeMethodTitle = recipemethodTitle;
        Recipe = recipe;
        Thumbnail = thumbnail;
    }

    public String getRecipeName(){
        return RecipeName;
    }
  public String getRecipeIngredients(){
        return RecipeIngredients;
  }
  public String getRecipeMethodTitle(){
        return RecipeMethodTitle;
  }
  public String getRecipe(){
        return Recipe;
  }
  public int getThumbnail(){
        return Thumbnail;
  }
}
