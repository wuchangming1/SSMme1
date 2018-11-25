package main.test;

import main.dao.DepartmentMapper;


import main.dao.EmployeeMapper;
import main.entity.Department;
import main.entity.Employee;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperText {

    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void myTest(){
//        departmentMapper.insertSelective(new Department(null,"扩大撒赖"));
//
//        System.out.println(departmentMapper);
//        employeeMapper.insertSelective(new Employee(null, "啊啊啊", "M", "Jerry@atguigu.com", 1));


        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0; i < 1000; i++) {
            String uid = UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Employee(null, uid, "M", uid+"@atguigu.com", 1));

        }
        System.out.println("完成");
    }
}
