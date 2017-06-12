package dockerplay.model;

import java.time.LocalDate;

/**
 * Created by yb
 * on 6/12/17.
 */
public class RewardRedeemed {

    private String rewardId;
    private LocalDate redeemedOn;
    private int pointCost;

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        this.rewardId = rewardId;
    }

    public LocalDate getRedeemedOn() {
        return redeemedOn;
    }

    public void setRedeemedOn(LocalDate redeemedOn) {
        this.redeemedOn = redeemedOn;
    }

    public int getPointCost() {
        return pointCost;
    }

    public void setPointCost(int pointCost) {
        this.pointCost = pointCost;
    }
}
