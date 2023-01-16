import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ZooManager {

    private Map<String, Object> foodData = new HashMap<>();

    public synchronized void put(String key, Object value) {
        foodData.put(key, value);
    }

    public synchronized Object get(String key) {
        return foodData.get(key);
    }

    @Override
    public String toString() {
        return "ZooManager{" +
                "foodData=" + foodData +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooManager that = (ZooManager) o;
        return Objects.equals(foodData, that.foodData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foodData);
    }
}
