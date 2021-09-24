package CanvasWrapper;

import java.time.OffsetDateTime;

public class CanvasObject {
    private static int id;
    private static OffsetDateTime createdAt;
    private static OffsetDateTime updatedAt;
    private static int courseId;
    private static String name;
    private static String HtmlUrl;
    private static Boolean Published;

    public CanvasObject() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        CanvasObject.id = id;
    }

    public static OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public static void setCreatedAt(OffsetDateTime createdAt) {
        CanvasObject.createdAt = createdAt;
    }

    public static OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public static void setUpdatedAt(OffsetDateTime updatedAt) {
        CanvasObject.updatedAt = updatedAt;
    }

    public static int getCourseId() {
        return courseId;
    }

    public static void setCourseId(int courseId) {
        CanvasObject.courseId = courseId;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        CanvasObject.name = name;
    }

    public static String getHtmlUrl() {
        return HtmlUrl;
    }

    public static void setHtmlUrl(String htmlUrl) {
        HtmlUrl = htmlUrl;
    }

    public static Boolean getPublished() {
        return Published;
    }

    public static void setPublished(Boolean published) {
        Published = published;
    }

}
