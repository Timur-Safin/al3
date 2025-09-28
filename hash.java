import java.util.HashMap;
import java.util.Map;

public class DrinksMap {
    public static void main(String[] args) {
        // создаём словарь (HashMap) где ключ - String, значение - Integer
        Map<String, Integer> hash = new HashMap<>();

        hash.put("beer", 100);
        hash.put("wisky", 650);
        hash.put("vodka", 350);

        // выводим содержимое
        for (Map.Entry<String, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
