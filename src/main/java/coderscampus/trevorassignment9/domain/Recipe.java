package coderscampus.trevorassignment9.domain;

public class Recipe {
    private Integer cookingMinutes;

    private Boolean dairyFree;

    private Boolean glutenFree;

    private String instructions;

    private Double preparationMinutes;

    private Double pricePerServing;

    private Integer readyInMinutes;

    private Integer servings;

    private Double spoonacularScore;

    private String title;

    private Boolean vegan;

    private Boolean vegetarian;

    public Recipe(String[] allValues) {
        this.cookingMinutes = Integer.parseInt(allValues[0]);
        this.dairyFree = Boolean.parseBoolean(allValues[1]);
        this.glutenFree = Boolean.parseBoolean(allValues[2]);
        this.instructions = allValues[3];
        this.preparationMinutes = Double.parseDouble(allValues[4]);
        this.pricePerServing = Double.parseDouble(allValues[5]);
        this.readyInMinutes = Integer.parseInt(allValues[6]);
        this.servings = Integer.parseInt(allValues[7]);
        this.spoonacularScore = Double.parseDouble(allValues[8]);
        this.title = allValues[9];
        this.vegan = Boolean.parseBoolean(allValues[10]);
        this.vegetarian = Boolean.parseBoolean(allValues[11]);
    }

    public Integer getCookingMinutes() {
        return cookingMinutes;
    }

    public Boolean getDairyFree() {
        return dairyFree;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }


    public String getInstructions() {
        return instructions;
    }


    public Double getPreparationMinutes() {
        return preparationMinutes;
    }


    public Double getPricePerServing() {
        return pricePerServing;
    }


    public Integer getReadyInMinutes() {
        return readyInMinutes;
    }


    public Integer getServings() {
        return servings;
    }


    public Double getSpoonacularScore() {
        return spoonacularScore;
    }


    public String getTitle() {
        return title;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }
}
