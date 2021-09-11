package canvasWrapper;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;

import java.lang.reflect.Field;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;

public class CanvasAssignment extends CanvasObject{
    private String           description;
    private OffsetDateTime   dueAt;
    private OffsetDateTime   unlockAt;
    private OffsetDateTime   lockAt;
    private double           pointsPossible;
    private String           gradingType; //ie "points"
    private int              assignmentGroupId;
    private int              gradingStandardId; //TODO find an instance of this being used and verify ID is an int
    private boolean          peerReviews;
    private boolean          automaticPeerReviews;
    private int              position;
    private boolean          gradeGroupStudentsIndividually;
    private boolean          anonymousPeerReviews;
    private int              groupCategoryId;
    private boolean          postToSis;
    private boolean          moderatedGrading;
    private boolean          omitFromFinalGrade;
    private boolean          intraGroupPeerReviews;
    private boolean          anonymousInstructorAnnotations;
    private boolean          anonymousGrading;
    private boolean          graders_anonymous_to_graders;
    private int              graderCount;
    private boolean          graderCommentsVisibleToGraders;
    private int              finalGraderId;
    private boolean          graderNamesVisibleToFinalGrader;
    private int              allowedAttempts;
    private String           secureParams; //looks like a jumble of letters
    private String           submissionTypes; //maybe make this an enum?
    private boolean          HasSubmittedSubmissions;
    private boolean          DueDateRequired;
    private int              MaxNameLength;
    private boolean          InClosedGradingPeriod;
    private boolean          IsQuizAssignment;
    private boolean          CanDuplicate;
    private int              OriginalCourseId;
    private int              OriginalAssignmentId;
    private String           OriginalAssignmentName;
    private int              OriginalQuizId;
    private String           WorkflowState;
    private boolean          Muted;
    private boolean          OnlyVisibleToOverrides;
    private boolean          LockedForUser;
    private String           SubmissionsDownloadUrl;
    private boolean          PostManually;
    private boolean          AnonymizeStudents;
    private boolean          RequireLockdownBrowser;
    private final Logger log = LogManager.getLogger(this.getClass());
    //private LockInfo lockInfo;

    public CanvasAssignment(String URI) {
        super(URI);
    }

    @Override
    public HashMap<String, Object> getProperties() {
        HashMap<String,Object> properties = new HashMap<>();
        Field[] fields = this.getClass().getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            try {
                properties.put(field.getName(),field.get(this));
            } catch (IllegalAccessException illegalAccessException) {
                log.warn(String.format("failed to add the %s field to the properties map.",field.getName()));
            }});
        return properties;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<String,Object> properties = getProperties();
        properties.keySet().forEach(property -> {
            if (!property.equals(log.toString())){
                stringBuilder.append(String.format("\n\t%s: %s",property,properties.get(property)));
            }
        });
        return stringBuilder.toString();
    }
}

