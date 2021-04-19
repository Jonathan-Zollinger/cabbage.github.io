import org.json.JSONObject;

import java.time.OffsetDateTime;

public class CanvasAssignment extends CanvasObject{
    private static int              AssignmentID;
    private static String           description;
    private static OffsetDateTime   dueAt;
    private static OffsetDateTime   unlockAt;
    private static OffsetDateTime   lockAt;
    private static double           pointsPossible;
    private static String           gradingType; //ie "points"
    private static int              assignmentGroupId;
    private static int              gradingStandardId; //TODO find an instance of this being used and verify ID is an int
    private static boolean          peerReviews;
    private static boolean          automaticPeerReviews;
    private static int              position;
    private static boolean          gradeGroupStudentsIndividually;
    private static boolean          anonymousPeerReviews;
    private static int              groupCategoryId;
    private static boolean          postToSis;
    private static boolean          moderatedGrading;
    private static boolean          omitFromFinalGrade;
    private static boolean          intraGroupPeerReviews;
    private static boolean          anonymousInstructorAnnotations;
    private static boolean          anonymousGrading;
    private static boolean          graders_anonymous_to_graders;
    private static int              graderCount;
    private static boolean          graderCommentsVisibleToGraders;
    private static int              finalGraderId;
    private static boolean          graderNamesVisibleToFinalGrader;
    private static int              allowedAttempts;
    private static String           secureParams; //looks like a jumble of letters
    private static String           submissionTypes; //maybe make this an enum?
    private static boolean          HasSubmittedSubmissions;
    private static boolean          DueDateRequired;
    private static int              MaxNameLength;
    private static boolean          InClosedGradingPeriod;
    private static boolean          IsQuizAssignment;
    private static boolean          CanDuplicate;
    private static int              OriginalCourseId;
    private static int              OriginalAssignmentId;
    private static String           OriginalAssignmentName;
    private static int              OriginalQuizId;
    private static String           WorkflowState;
    private static boolean          Muted;
    private static boolean          OnlyVisibleToOverrides;
    private static boolean          LockedForUser;
    private static String           SubmissionsDownloadUrl;
    private static boolean          PostManually;
    private static boolean          AnonymizeStudents;
    private static boolean          RequireLockdownBrowser;
    private static LockInfo         lockInfo;

    public CanvasAssignment() {
    }
    public void setEverything(JSONObject jsonObject) {
        setDescription(jsonObject);
        setDueAt(jsonObject);
        setUnlockAt(jsonObject);
        setLockAt(jsonObject);
        setPointsPossible(jsonObject);
        setGradingType(jsonObject);
        setAssignmentGroupId(jsonObject);
        setGradingStandardId(jsonObject);
        setPeerReviews(jsonObject);
        setAutomaticPeerReviews(jsonObject);
        setPosition(jsonObject);
        setGradeGroupStudentsIndividually(jsonObject);
        setAnonymousPeerReviews(jsonObject);
        setGroupCategoryId(jsonObject);
        setPostToSis(jsonObject);
        setModeratedGrading(jsonObject);
        setOmitFromFinalGrade(jsonObject);
        setIntraGroupPeerReviews(jsonObject);
        setAnonymousInstructorAnnotations(jsonObject);
        setAnonymousGrading(jsonObject);
        setGraderAnonymousToGraders(jsonObject);
        setGraderCount(jsonObject);
        setGraderCommentsVisibleToGraders(jsonObject);
        setFinalGraderId(jsonObject);
        setGraderNamesVisibleToFinalGrader(jsonObject);
        setAllowedAttempts(jsonObject);
        setSecureParams(jsonObject);
        setSubmissionTypes(jsonObject);
        setHasSubmittedSubmissions(jsonObject);
        setDueDateRequired(jsonObject);
        setMaxNameLength(jsonObject);
        setInClosedGradingPeriod(jsonObject);
        setIsQuizAssignment(jsonObject);
        setCanDuplicate(jsonObject);
        setOriginalCourseId(jsonObject);
        setOriginalAssignmentId(jsonObject);
        setOriginalAssignmentName(jsonObject);
        setOriginalQuizId(jsonObject);
        setWorkflowState(jsonObject);
        setMuted(jsonObject);
        setOnlyVisibleToOverrides(jsonObject);
        setLockedForUser(jsonObject);
        setSubmissionsDownloadUrl(jsonObject);
        setPostManually(jsonObject);
        setAnonymizeStudents(jsonObject);
        setRequireLockdownBrowser(jsonObject);
        setLockInfo(jsonObject);
        setAssignmentID(jsonObject);
    }

    public static void setDescription(JSONObject jsonObject) {
        description = jsonObject.getString("id");
    }//end setDescription()

    public static OffsetDateTime getDueAt() {
        return dueAt;
    }//end getDueAt()

    public static void setDueAt(JSONObject jsonObject) {
        dueAt = OffsetDateTime.parse(jsonObject.getString("due_at"));
    }//end setDueAt()

    public static OffsetDateTime getUnlockAt() {
        return unlockAt;
    }//end getUnlockAt()

    public static void setUnlockAt(JSONObject jsonObject) {
        unlockAt = OffsetDateTime.parse(jsonObject.getString("unlock_at"));
    }//end setUnlockAt()

    public static OffsetDateTime getLockAt() {
        return lockAt;
    }//end getLockAt()

    public static void setLockAt(JSONObject jsonObject) {
        lockAt = OffsetDateTime.parse(jsonObject.getString("lock_at"));
    }//end setLockAt()

    public static double getPointsPossible() {
        return pointsPossible;
    }//end getPointsPossible()

    public static void setPointsPossible(JSONObject jsonObject) {
        pointsPossible = jsonObject.getInt("points_possible");
    }//end setPointsPossible()

    public static String getGradingType() {
        return gradingType;
    }//end getGradingType()

    public static void setGradingType(JSONObject jsonObject) {
        gradingType = jsonObject.getString("grading_type");
    }//end setGradingType()

    public static int getAssignmentGroupId() {
        return assignmentGroupId;
    }//end getAssignmentGroupId()

    public static void setAssignmentGroupId(JSONObject jsonObject) {
        assignmentGroupId = jsonObject.getInt("assignment_group_id");
    }//end setAssignmentGroupId()

    public static int getGradingStandardId() {
        return gradingStandardId;
    }//end getGradingStandardId()

    public static void setGradingStandardId(JSONObject jsonObject) {
        gradingStandardId = jsonObject.getInt("");
    }//end setGradingStandardId()

    public static boolean isPeerReviews() {
        return peerReviews;
    }//end isPeerReviews()

    public static void setPeerReviews(JSONObject jsonObject) {
        peerReviews = jsonObject.getBoolean("peer_reviews");
    }//end setPeerReviews()

    public static boolean isAutomaticPeerReviews() {
        return automaticPeerReviews;
    }//end isAutomaticPeerReviews()

    public static void setAutomaticPeerReviews(JSONObject jsonObject) {
        automaticPeerReviews = jsonObject.getBoolean("automatic_peer_reviews");
    }//end setAutomaticPeerReviews()

    public static int getPosition() {
        return position;
    }//end getPosition()

    public static void setPosition(JSONObject jsonObject) {
        position = jsonObject.getInt("position");
    }//end setPosition()

    public static boolean isGradeGroupStudentsIndividually() {
        return gradeGroupStudentsIndividually;
    }//end isGradeGroupStudentsIndividually()

    public static void setGradeGroupStudentsIndividually(JSONObject jsonObject) {
        gradeGroupStudentsIndividually = jsonObject.getBoolean("grade_group_students_individually");
    }//end setGradeGroupStudentsIndividually()

    public static boolean isAnonymousPeerReviews() {
        return anonymousPeerReviews;
    }//end isAnonymousPeerReviews()

    public static void setAnonymousPeerReviews(JSONObject jsonObject) {
        anonymousPeerReviews = jsonObject.getBoolean("anonymous_peer_reviews");
    }//end setAnonymousPeerReviews()

    public static int getGroupCategoryId() {
        return groupCategoryId;
    }//end getGroupCategoryId()

    public static void setGroupCategoryId(JSONObject jsonObject) {
        groupCategoryId = jsonObject.getInt("group_category_id");
    }//end setGroupCategoryId()

    public static boolean isPostToSis() {
        return postToSis;
    }

    public static void setPostToSis(JSONObject jsonObject) {
        postToSis = jsonObject.getBoolean("post_to_sis");
    }//end setPostToSis()

    public static boolean isModeratedGrading() {
        return moderatedGrading;
    }//end isModeratedGrading()

    public static void setModeratedGrading(JSONObject jsonObject) {
        moderatedGrading = jsonObject.getBoolean("moderated_grading");
    }//end setModeratedGrading()

    public static boolean isOmitFromFinalGrade() {
        return omitFromFinalGrade;
    }//end isOmitFromFinalGrade()

    public static void setOmitFromFinalGrade(JSONObject jsonObject) {
        omitFromFinalGrade = jsonObject.getBoolean("omit_from_final_grade");
    }//end setOmitFromFinalGrade()

    public static boolean isIntraGroupPeerReviews() {
        return intraGroupPeerReviews;
    }//end isIntraGroupPeerReviews()

    public static void setIntraGroupPeerReviews(JSONObject jsonObject) {
        intraGroupPeerReviews = jsonObject.getBoolean("intra_group_peer_reviews");
    }//end setIntraGroupPeerReviews()

    public static boolean isAnonymousInstructorAnnotations() {
        return anonymousInstructorAnnotations;
    }//end isAnonymousInstructorAnnotations()

    public static void setAnonymousInstructorAnnotations(JSONObject jsonObject) {
        anonymousInstructorAnnotations = jsonObject.getBoolean("anonymous_instructor_annotations");
    }//end setAnonymousInstructorAnnotations()

    public static boolean isAnonymousGrading() {
        return anonymousGrading;
    }//end isAnonymousGrading()

    public static void setAnonymousGrading(JSONObject jsonObject) {
        anonymousGrading = jsonObject.getBoolean("anonymous_grading");
    }//end setAnonymousGrading()

    public static boolean isGraders_anonymous_to_graders() {
        return graders_anonymous_to_graders;
    }//end isGraders_anonymous_to_graders()

    public static void setGraderAnonymousToGraders(JSONObject jsonObject) {
        graders_anonymous_to_graders = jsonObject.getBoolean("graders_anonymous_to_graders");
    }//end setGraders_anonymous_to_graders()

    public static int getGraderCount() {
        return graderCount;
    }//end getGraderCount()

    public static void setGraderCount(JSONObject jsonObject) {
        graderCount = jsonObject.getInt("grader_count");
    }//end setGraderCount()

    public static boolean isGraderCommentsVisibleToGraders() {
        return graderCommentsVisibleToGraders;
    }//end isGraderCommentsVisibleToGraders()

    public static void setGraderCommentsVisibleToGraders(JSONObject jsonObject) {
        graderCommentsVisibleToGraders = jsonObject.getBoolean("grader_comments_visible_to_graders");
    }//end setGraderCommentsVisibleToGraders()

    public static int getFinalGraderId() {
        return finalGraderId;
    }//end getFinalGraderId()

    public static void setFinalGraderId(JSONObject jsonObject) {
        finalGraderId = jsonObject.getInt("final_grader_id");
    }//end setFinalGraderId()

    public static boolean isGraderNamesVisibleToFinalGrader() {
        return graderNamesVisibleToFinalGrader;
    }//end isGraderNamesVisibleToFinalGrader()

    public static void setGraderNamesVisibleToFinalGrader(JSONObject jsonObject) {
        graderNamesVisibleToFinalGrader = jsonObject.getBoolean("grader_names_visible_to_final_grader");
    }//end setGraderNamesVisibleToFinalGrader()

    public static int getAllowedAttempts() {
        return allowedAttempts;
    }//end getAllowedAttempts()

    public static void setAllowedAttempts(JSONObject jsonObject) {
        allowedAttempts = jsonObject.getInt("allowed_attempts");
    }//end setAllowedAttempts()

    public static String getSecureParams() {
        return secureParams;
    }//end getSecureParams()

    public static void setSecureParams(JSONObject jsonObject) {
        secureParams = jsonObject.getString("secure_params");
    }//end setSecureParams()

    public static String getSubmissionTypes() {
        return submissionTypes;
    }//end getSubmissionTypes()

    public static void setSubmissionTypes(JSONObject jsonObject) {
        submissionTypes = jsonObject.getString("submission_types");
    }//end setSubmissionTypes()

    public static boolean isHasSubmittedSubmissions() {
        return HasSubmittedSubmissions;
    }//end isHasSubmittedSubmissions()

    public static void setHasSubmittedSubmissions(JSONObject jsonObject) {
        HasSubmittedSubmissions = jsonObject.getBoolean("has_submitted_submissions");
    }//end setHasSubmittedSubmissions()

    public static boolean isDueDateRequired() {
        return DueDateRequired;
    }//end isDueDateRequired()

    public static void setDueDateRequired(JSONObject jsonObject) {
        DueDateRequired = jsonObject.getBoolean("due_date_required");
    }//end setDueDateRequired()

    public static int getMaxNameLength() {
        return MaxNameLength;
    }//end getMaxNameLength()

    public static void setMaxNameLength(JSONObject jsonObject) {
        MaxNameLength = jsonObject.getInt("max_name_length");
    }//end setMaxNameLength()

    public static boolean isInClosedGradingPeriod() {
        return InClosedGradingPeriod;
    }//end isInClosedGradingPeriod()

    public static void setInClosedGradingPeriod(JSONObject jsonObject) {
        InClosedGradingPeriod = jsonObject.getBoolean("in_closed_grading_period");
    }//end setInClosedGradingPeriod()

    public static boolean isIsQuizAssignment() {
        return IsQuizAssignment;
    }//end isIsQuizAssignment()

    public static void setIsQuizAssignment(JSONObject jsonObject) {
        IsQuizAssignment = jsonObject.getBoolean("is_quiz_assignment");
    }//end setIsQuizAssignment()

    public static boolean CanDuplicate() {
        return CanDuplicate;
    }//end isCanDuplicate()

    public static void setCanDuplicate(JSONObject jsonObject) {
        CanDuplicate = jsonObject.getBoolean("can_duplicate");
    }//end setCanDuplicate()

    public static int getOriginalCourseId() {
        return OriginalCourseId;
    }//end getOriginalCourseId()

    public static void setOriginalCourseId(JSONObject jsonObject) {
        OriginalCourseId = jsonObject.getInt("original_course_id");
    }//end setOriginalCourseId()

    public static int getOriginalAssignmentId() {
        return OriginalAssignmentId;
    }//end getOriginalAssignmentId()

    public static void setOriginalAssignmentId(JSONObject jsonObject) {
        OriginalAssignmentId = jsonObject.getInt("original_assignment_id");
    }//end setOriginalAssignmentId()

    public static String getOriginalAssignmentName() {
        return OriginalAssignmentName;
    }//end getOriginalAssignmentName()

    public static void setOriginalAssignmentName(JSONObject jsonObject) {
        OriginalAssignmentName = jsonObject.getString("original_assignment_name");
    }//end setOriginalAssignmentName()

    public static int getOriginalQuizId() {
        return OriginalQuizId;
    }//end isOriginalQuizId()

    public static void setOriginalQuizId(JSONObject jsonObject) {
        OriginalQuizId = jsonObject.getInt("original_quiz_id");
    }//end setOriginalQuizId()

    public static String getWorkflowState() {
        return WorkflowState;
    }//end getWorkflowState()

    public static void setWorkflowState(JSONObject jsonObject) {
        WorkflowState = jsonObject.getString("workflow_state");
    }//end setWorkflowState()

    public static boolean isMuted() {
        return Muted;
    }//end isMuted()

    public static void setMuted(JSONObject jsonObject) {
        Muted = jsonObject.getBoolean("muted");
    }//end setMuted()

    public static boolean isOnlyVisibleToOverrides() {
        return OnlyVisibleToOverrides;
    }//end isOnlyVisibleToOverrides()

    public static void setOnlyVisibleToOverrides(JSONObject jsonObject) {
        OnlyVisibleToOverrides = jsonObject.getBoolean("only_visible_to_overrides");
    }//end setOnlyVisibleToOverrides()

    public static boolean isLockedForUser() {
        return LockedForUser;
    }//end isLockedForUser()

    public static void setLockedForUser(JSONObject jsonObject) {
        LockedForUser = jsonObject.getBoolean("locked_for_user");
    }//end setLockedForUser()

    public static String getSubmissionsDownloadUrl() {
        return SubmissionsDownloadUrl;
    }//end getSubmissionsDownloadUrl()

    public static void setSubmissionsDownloadUrl(JSONObject jsonObject) {
        SubmissionsDownloadUrl = jsonObject.getString("submissions_download_url");
    }//end setSubmissionsDownloadUrl()

    public static boolean isPostManually() {
        return PostManually;
    }//end isPostManually()

    public static void setPostManually(JSONObject jsonObject) {
        PostManually = jsonObject.getBoolean("");
    }//end setPostManually()

    public static boolean isAnonymizeStudents() {
        return AnonymizeStudents;
    }//end isAnonymizeStudents()

    public static void setAnonymizeStudents(JSONObject jsonObject) {
        AnonymizeStudents = jsonObject.getBoolean("anonymize_students");
    }//end setAnonymizeStudents()

    public static boolean isRequireLockdownBrowser() {
        return RequireLockdownBrowser;
    }//end isRequireLockdownBrowser()

    public static void setRequireLockdownBrowser(JSONObject jsonObject) {
        RequireLockdownBrowser = jsonObject.getBoolean("require_lockdown_browser");
    }//end setRequireLockdownBrowser()

    public static LockInfo getLockInfo() {
        return lockInfo;
    }//end getLockInfo()

    public static void setLockInfo(JSONObject jsonObject) {
        lockInfo = new LockInfo();//TODO call all lock info
    }//end setLockInfo()

    public static void setAssignmentID(JSONObject jsonObject) {
        AssignmentID = jsonObject.getInt("");
    }//end setAssignmentID()
}

