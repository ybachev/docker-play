package dockerplay.model;

import java.time.LocalDate;

/**
 * Created by yb
 * on 6/12/17.
 */
public class MissionCompletion {
    private String missionId;
    private LocalDate completionDate;
    private int pointsEarned;

    public String getMissionId() {
        return missionId;
    }

    public void setMissionId(String missionId) {
        this.missionId = missionId;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }
}
