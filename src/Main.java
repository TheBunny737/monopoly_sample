import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DataSourceDB dataSource = new DataSourceDB();
        Map<Integer, Food> foods = dataSource.readFoods();

        RestaurantTable table1 = new RestaurantTable(1, foods);
        RestaurantTable table2 = new RestaurantTable(2, foods);

        table1.checkTableInformation();
        table2.checkTableInformation();
    }
}