package com.example.basichello;

import com.example.basichello.model.Employee;
import com.example.basichello.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
@RestController
public class BasicController {
    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/world")
    List<UserData> hello() {
        List<UserData> userDataList = new ArrayList<>();
        userDataList.add(UserData.builder().name("Karthik").age(11).build());
        userDataList.add(UserData.builder().name("Nyra").age(5).build());
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return userDataList;
    }

    @PostMapping("/api/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }

    @GetMapping("/api/employee")
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

//    @DeleteMapping("/employee/{id}")
//    public void deleteByID(@PathVariable("id") Integer id) {
//
//        repository.delete(Employee.builder().employeeID(id).build());
//    }
}
