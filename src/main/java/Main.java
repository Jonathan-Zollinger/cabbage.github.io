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
import java.util.stream.Stream;

public class Main {
    private static HttpURLConnection connection;

    public static void main(String[] args) {
        BufferedReader reader;
        String line;
        String token = readFile( "src/canvas token.txt");
        StringBuilder responseContent = new StringBuilder();
        try{
            URL url = new URL("https://ensign.instructure.com/api/v1/courses/8166/assignments");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Accept","application/json");
            connection.setRequestProperty("Authorization", "Bearer " + token);
            int status = connection.getResponseCode();

            if (status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }else{
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
            while((line = reader.readLine()) != null){
                responseContent.append(line);
            }
            reader.close();
            System.out.print(responseContent);
        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
        connection.disconnect();
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
