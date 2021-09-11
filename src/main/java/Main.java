import canvasWrapper.CanvasAssignment;
import canvasWrapper.CanvasObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Stream;

public class Main {
    private static HttpURLConnection connection;

    public static void main(String[] args) {
        CanvasObject canvasObject = new CanvasAssignment("courses");
        System.out.print(canvasObject);
//        BufferedReader reader;
//        String line;
//        String token = readFile( "src/canvas token.txt");
//        StringBuilder responseContent = new StringBuilder();
//        try{
//            URL url = new URL("https://ensign.instructure.com/api/v1/courses/8166/assignments");
//            connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestProperty("Accept","application/json");
//            connection.setRequestProperty("Authorization", "Bearer " + token);
//            int status = connection.getResponseCode();
//
//            if (status > 299){
//                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
//            }else{
//                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            }
//            while((line = reader.readLine()) != null){
//                responseContent.append(line);
//            }
//            reader.close();
//            System.out.print(responseContent);
//        } catch (IOException malformedURLException) {
//            malformedURLException.printStackTrace();
//        }
//        connection.disconnect();
//        JSONObject jo = new JSONObject(responseContent);
//        String statusLine = jo.getJSONObject("statusLine").toString();
//        JSONArray jsonObjects = new JSONArray(responseContent);


    }//end main


    public static String parseCanvasAssignment(String responseBody){
        //TODO - figure proper data types for imported values
        //TODO - verify all available values within an assignment are addressed with this method
        JSONArray jsonObjects = new JSONArray(responseBody);
        for(Object object:jsonObjects){
            JSONObject jsonObject = (JSONObject) object;
        }
        return "";
    }
    public static String readFile(String filePath){
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(contentBuilder::append);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return contentBuilder.toString();
    }

}
