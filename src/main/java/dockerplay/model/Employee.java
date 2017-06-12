package dockerplay.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 *
  Created by yb
  on 6/6/17.
 */


@Data
@Document(collection = "employees")
public class Employee {

    @Id
    private String id;

    private String email;

    private String fullName;

    private String managerEmail;

    private int totalPointsEarned;

    private int availablePoints;

    private List<MissionCompletion> completedMissions = new ArrayList<>();

    private List<RewardRedeemed> redeemedRewards = new ArrayList<>();


    public Employee(String email, String fullName) {
        this.email = email;
        this.fullName = fullName;
    }
}
