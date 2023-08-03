import java.util.HashMap;
import java.util.Map;

public class DataSourceDB {
    public Map<Integer,Food> readFoods(){
        Map<Integer, Food> foods = new HashMap<>();

        foods.put(1,new Food("Cake", 5));
        foods.put(2,new Food("Sushi", 10));
        foods.put(3,new Food("Ice-Cream", 2));

        return foods;
    }
    public void printFoodList() {
        Map<Integer, Food> foods = readFoods();

        for (Map.Entry<Integer, Food> entry : foods.entrySet()) {
            int foodId = entry.getKey();
            Food food = entry.getValue();
            System.out.println("Food ID: " + foodId + ", Name: " + food.getName() + ", Quantity: " + food.getQuantity());
        }
    }
}
