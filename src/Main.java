import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Картошка", 19, 1.5));
        list.add(new Product("Помидоры", 129.99, 1.2));
        list.add(new Product("Огурцы", 69, 0.8));
        list.add(new Product("Морковь", 40, 0.5));


        System.out.println(list);

        hasDuplicates(list);


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
}


