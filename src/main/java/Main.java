import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;


public class Main {
    public static void main(String[] args) {
        try {
            HttpResponse<JsonNode> response = Unirest.get("https://imdb-api.com/en/API/MostPopularMovies/k_4nkwea6a")
                    .header("Content-Type","application/json").asJson();
            JSONObject obj = response.getBody().getObject();
            JSONArray arr = obj.getJSONArray("items");
            for (int i = 0; i < arr.length(); i++) {
                JSONObject temp = (JSONObject) arr.get(i);
                System.out.println(temp.get("title"));
            }
            System.out.println(arr.get(1));
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}
