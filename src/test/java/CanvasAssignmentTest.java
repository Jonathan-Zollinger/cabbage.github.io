import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class CanvasAssignmentTest {
    private static HttpURLConnection connection;
    private static BufferedReader reader;
    private static String line;
    private static String token = "2974~T6Q3ivuaNG9SMki9kUKbLcLu9EUvpaeGeTW6vQDNS0ajYScRU3kp7ue2ZAhtcdZE";
    private static StringBuilder responseContent = new StringBuilder();

    private static void setJsonObject() {
        try {
            URL url = new URL("https://ensign.instructure.com/api/v1/courses/8166/assignments");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("Authorization", "Bearer " + token);
            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            }
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();
            System.out.print(responseContent.toString());
        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        connection.disconnect();
    }
    @Test
    void setDescription() {

    }

    @Test
    void setDueAt() {

        //assertNull();
    }

    @Test
    void setUnlockAt() {
    }

    @Test
    void setLockAt() {
    }

    @Test
    void setPointsPossible() {
    }

    @Test
    void setGradingType() {
    }

    @Test
    void setAssignmentGroupId() {
    }

    @Test
    void setGradingStandardId() {
    }

    @Test
    void setPeerReviews() {
    }

    @Test
    void setAutomaticPeerReviews() {
    }

    @Test
    void setPosition() {
    }

    @Test
    void setGradeGroupStudentsIndividually() {
    }

    @Test
    void setAnonymousPeerReviews() {
    }

    @Test
    void setGroupCategoryId() {
    }

    @Test
    void setPostToSis() {
    }

    @Test
    void setModeratedGrading() {
    }

    @Test
    void setOmitFromFinalGrade() {
    }

    @Test
    void setIntraGroupPeerReviews() {
    }

    @Test
    void setAnonymousInstructorAnnotations() {
    }

    @Test
    void setAnonymousGrading() {
    }

    @Test
    void setGraders_anonymous_to_graders() {
    }

    @Test
    void setGraderCount() {
    }

    @Test
    void setGraderCommentsVisibleToGraders() {
    }

    @Test
    void setFinalGraderId() {
    }

    @Test
    void setGraderNamesVisibleToFinalGrader() {
    }

    @Test
    void setAllowedAttempts() {
    }

    @Test
    void setSecureParams() {
    }

    @Test
    void setSubmissionTypes() {
    }

    @Test
    void setHasSubmittedSubmissions() {
    }

    @Test
    void setDueDateRequired() {
    }

    @Test
    void setMaxNameLength() {
    }

    @Test
    void setInClosedGradingPeriod() {
    }

    @Test
    void setIsQuizAssignment() {
    }

    @Test
    void setCanDuplicate() {
    }

    @Test
    void setOriginalCourseId() {
    }

    @Test
    void setOriginalAssignmentId() {
    }

    @Test
    void setOriginalAssignmentName() {
    }

    @Test
    void setOriginalQuizId() {
    }

    @Test
    void setWorkflowState() {
    }

    @Test
    void setMuted() {
    }

    @Test
    void setOnlyVisibleToOverrides() {
    }

    @Test
    void setLockedForUser() {
    }

    @Test
    void setSubmissionsDownloadUrl() {
    }

    @Test
    void setPostManually() {
    }

    @Test
    void setAnonymizeStudents() {
    }

    @Test
    void setRequireLockdownBrowser() {
    }

    @Test
    void setLockInfo() {
    }

    @Test
    void setAssignmentID() {
    }
}