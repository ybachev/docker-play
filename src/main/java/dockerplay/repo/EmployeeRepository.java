package dockerplay.repo;

import dockerplay.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 Created by yb
 on 6/6/17.
 */

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
