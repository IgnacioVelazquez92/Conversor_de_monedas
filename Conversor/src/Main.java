import com.google.gson.Gson;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Example JSON with currency conversion rates
        String json = "{\"USD\":1.0, \"EUR\":0.91}";
        Gson gson = new Gson();
        Map<String, Double> rates = gson.fromJson(json, Map.class);
        System.out.println("Tasas: " + rates);
    }
}
