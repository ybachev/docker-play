package dockerplay.controller;

import dockerplay.model.Employee;
import dockerplay.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yb
 * on 6/6/17.
 */

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee) {

        Employee result = employeeRepository.save(employee);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{employeeId}")
    public Employee get(@PathVariable String employeeId) {

        Employee resultOne = employeeRepository.findOne(employeeId);
        return resultOne;
    }

    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<Employee> getAll(@PathVariable String employeeId) {

        List<Employee> resultAll = employeeRepository.findAll();
        return resultAll;
    }


}
