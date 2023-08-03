import java.util.Map;

public class RestaurantTable {
    private int tableNumber;
    private Map<Integer, Food> foods;

    public RestaurantTable(int tableNumber, Map<Integer, Food> foods) {
        this.tableNumber = tableNumber;
        this.foods = foods;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Map<Integer, Food> getFoods() {
        return foods;
    }

    public void setFoods(Map<Integer, Food> foods) {
        this.foods = foods;
    }

    public void checkTableInformation() {
        if (tableNumber <= 0 || foods.isEmpty()) {
            System.out.println("Error");
        } else {
            System.out.println("Table Number: " + tableNumber);
            System.out.println("Ordered Foods:");
            for (Map.Entry<Integer, Food> entry : foods.entrySet()) {
                int foodId = entry.getKey();
                Food food = entry.getValue();
                System.out.println("Food ID: " + foodId + ", Name: " + food.getName() + ", Quantity: " + food.getQuantity());
            }
        }
    }
}