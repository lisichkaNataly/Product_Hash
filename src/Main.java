import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Картошка", 19, 1.5));
        list.add(new Product("Помидоры", 129.99, 1.2));
        list.add(new Product("Огурцы", 69, 0.8));
        list.add(new Product("Майонез", 59, 0.1));
        list.add(new Product("Соль", 10, 0.002));
        list.add(new Product("Кинза", 49, 0.30));
        list.add(new Product("Масло подсолнечное", 99, 0.01));

        System.out.println(list);

        hasDuplicates(list);


        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(new Recipe(
                "Летний салат",
                "Помидоры, огурцы, майонез, соль",
                257.9));
        recipeList.add(new Recipe(
                "Картофель с маслом",
                "Картофель, масло подсолнечное, кинза, соль",
                234.6));
        recipeList.add(new Recipe(
                "Картофель к рыбке",
                "Картофель, масло подсолнечное, кинза, соль",
                177.7));


        System.out.println(recipeList);
        hasDuplicatesRecipe(recipeList);




    }

    public static <T> boolean hasDuplicates(List<T> list){
        int count = list.size();
        T t1,t2;
        for(int i=0;i<count;i++){
            t1 = list.get(i);
            for(int j=i+1;j<count;j++){
                t2 = list.get(j);
                if(t2.equals(t1)){
                    throw new RuntimeException("Этот продукт уже куплен - есть в списке!");
                }
            }
        }
        return false;
    }


    public static <T> boolean hasDuplicatesRecipe (List<T> recipeList){
        int count = recipeList.size();
        T t1,t2;
        for(int i=0;i<count;i++){
            t1 = recipeList.get(i);
            for(int j=i+1;j<count;j++){
                t2 = recipeList.get(j);
                if(t2.equals(t1)){
                    throw new RuntimeException("Рецепт с таким названием уже существует - добавьте новый!");
                }
            }
        }
        return false;
    }



}


