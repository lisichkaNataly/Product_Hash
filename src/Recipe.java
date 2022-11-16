import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {


    private String nameOfRecipe;
    private String lotsOfProducts;
    private Double totalCostOfProducts;

    public Recipe(String nameOfRecipe, String lotsOfProducts, Double totalCostOfProducts) {
        this.nameOfRecipe = nameOfRecipe;
        this.lotsOfProducts = lotsOfProducts;
        this.totalCostOfProducts = totalCostOfProducts;

    }

    public String getLotsOfProducts() {
        return lotsOfProducts;
    }

    public double getTotalCostOfProducts() {
        return totalCostOfProducts;
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameOfRecipe, recipe.nameOfRecipe) && Objects.equals(lotsOfProducts, recipe.lotsOfProducts) && Objects.equals(totalCostOfProducts, recipe.totalCostOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe, lotsOfProducts, totalCostOfProducts);
    }

    @Override
    public String toString() {
        return "{Рецепт " + " <<" +
                nameOfRecipe + " >> " +
                ": Список продуктов: " + lotsOfProducts +
                ". Стоимость продуктов: " + totalCostOfProducts + " руб.}";
    }
}
