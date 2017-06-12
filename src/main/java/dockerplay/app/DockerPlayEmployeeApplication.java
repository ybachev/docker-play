package dockerplay.app;

import dockerplay.model.Employee;
import dockerplay.model.MissionCompletion;
import dockerplay.model.RewardRedeemed;
import dockerplay.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

/**
 * Created by yb
 * on 6/6/17.
 */

@SpringBootApplication
@EnableMongoRepositories({"dockerplay.repo"})
public class DockerPlayEmployeeApplication implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DockerPlayEmployeeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        Employee employee1 = new Employee("yb@mail.bg", "Yavor Bachev");
        Employee employee2 = new Employee("bb@mail.bg", "Boris Bachev");

        RewardRedeemed reward1 = new RewardRedeemed();
        reward1.setPointCost(2);
        reward1.setRewardId("1");

        MissionCompletion missionCompletion = new MissionCompletion();
        missionCompletion.setMissionId("1");
        missionCompletion.setPointsEarned(reward1.getPointCost());

        employee1.setRedeemedRewards(Arrays.asList(reward1));
        employee1.setCompletedMissions(Arrays.asList(missionCompletion));

        repository.save(employee1);
        repository.save(employee2);

        for (Employee emp : repository.findAll()) {
            System.out.println(emp.toString());
        }

    }

}
