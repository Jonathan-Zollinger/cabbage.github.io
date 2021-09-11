package canvasWrapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONArray;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public abstract class CanvasObject {
    /* -------------------------------------------------- Fields -------------------------------------------------- */
    private int id;
    private OkHttpClient client = new OkHttpClient().newBuilder().build();
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private String name;
    private String URI;
    private Boolean Published;
    private String access_restricted_by_date;
    private final Logger log = LogManager.getLogger(this.getClass());
    private Response response;

    /* ----------------------------------------------- Constructors ----------------------------------------------- */
    public CanvasObject(String URI) {
        this.URI = URI;
    }

    /* -------------------------------------------------- Getters -------------------------------------------------- */

    /**
     * Gets current value assigned to the access_restricted_by_date field.
     * @return current value for the access_restricted_by_date field.
     */
    public String getAccess_restricted_by_date() {
        return access_restricted_by_date;
    }//end getAccess_restricted_by_date()

    /**
     * Gets current value assigned to the id field.
     * @return current value for the id field.
     */
    public int getId() {
        return id;
    }//end getId()

    /**
     * Gets current value assigned to the createdAt field.
     * @return current value for the createdAt field.
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }//end getCreatedAt()

    /**
     * Gets current value assigned to the updatedAt field.
     * @return current value for the updatedAt field.
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }//end getUpdatedAt()


    /**
     * Gets current value assigned to the name field.
     * @return current value for the name field.
     */
    public String getName() {
        return name;
    }//end getName()

    /**
     * Gets current value assigned to the URI field. For this wrapper class, this is everything after
     * "https://ensign.instructure.com/api/v1/".
     * @return current value for the URI field.
     */
    public String getURI() {
        return URI;
    }//end getURI()

    /**
     * Gets current value assigned to the Published field.
     * @return current value for the Published field.
     */
    public Boolean isPublished() {
        return Published;
    }//end isPublished()

    public abstract HashMap<String,Object> getProperties();
//    {
//        HashMap<String,Object> properties = new HashMap<>();
//        Field[] fields = this.getClass().getDeclaredFields();
//        Arrays.stream(fields).forEach(field -> {
//            try {
//                properties.put(field.getName(),field.get(this));
//            } catch (IllegalAccessException illegalAccessException) {
//                log.warn(String.format("failed to add the %s field to the properties map.",field.getName()));
//            }});
//        return properties;
//    }
    public abstract String toString();

    /* -------------------------------------------------- Setters -------------------------------------------------- */
    /**
     * Assigns given value to the id field.
     * @param id value to be assigned to the #field.name field.
     */
    public void setId(int id) {
        this.id = id;
    }//end setId()

    /**
     * Assigns given value to the createdAt field.
     * @param createdAt value to be assigned to the #field.name field.
     */
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }//end setCreatedAt()

    /**
     * Assigns given value to the updatedAt field.
     * @param updatedAt value to be assigned to the #field.name field.
     */
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }//end setUpdatedAt()

    /**
     * Assigns given value to the name field.
     * @param name value to be assigned to the #field.name field.
     */
    public void setName(String name) {
        this.name = name;
    }//end setName()

    /**
     * Assigns given value to the URI field. For this wrapper class, this is everything after
     * "https://ensign.instructure.com/api/v1/".
     * @param URI value to be assigned to the #field.name field.
     */
    public void setURI(String URI) {
        this.URI = URI;
    }//end setURI()

    /**
     * Assigns given value to the Published field.
     * @param published value to be assigned to the #field.name field.
     */
    public void setPublished(Boolean published) {
        Published = published;
    }//end setPublished()

    /**
     * Assigns given value to the access_restricted_by_date field.
     * @param access_restricted_by_date value to be assigned to the #field.name field.
     */
    public void setAccess_restricted_by_date(String access_restricted_by_date) {
        this.access_restricted_by_date = access_restricted_by_date;
    }//end setAccess_restricted_by_date()

    /* -------------------------------------------------- Methods -------------------------------------------------- */

    /**
     * performs the get request with the provided URI.
     *
     */
    public void makeGetRequest() throws IOException {
        String token = readFile( "src/canvas token.txt");
        String headerValue = readFile("src/main/resources/headerValue");
        Request request = new Request.Builder()
                .url(String.format("https://ensign.instructure.com/api/v1/%s", URI))
                .method("GET", null)
                .addHeader("Authorization", String.format("Bearer %s",token))
                .addHeader("Cookie", headerValue)
                .build();//TODO: make addHeader() cleaner
        response = client.newCall(request).execute();
        JSONArray jsonObjects = new JSONArray(request);

    }//end makeGetRequest()

    /**
     *
     * @param filePath
     * @return
     */
    public static String readFile(String filePath){
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(contentBuilder::append);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return contentBuilder.toString();
    }//end readFile
}
