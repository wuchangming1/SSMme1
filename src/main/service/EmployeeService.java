package main.service;

import com.github.pagehelper.PageHelper;
import main.dao.EmployeeMapper;
import main.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAll(){

       return  employeeMapper.selectByExampleWithDept(null);
    }
}
