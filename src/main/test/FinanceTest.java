package main.test;


import main.dao.FinanceMapper;
import main.dao.FinanceSelectMapper;
import main.entity.Finance;
import main.entity.FinanceSelect;
import main.service.FinanceService;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class FinanceTest {

//   @Autowired
//   FinanceService financeService;
@Autowired
    FinanceMapper financeMapper;
    @Autowired
    FinanceSelectMapper financeSelectMapper;
    @Test
    public void test(){

//        List<Finance> list = financeService.getAll();
        List<Finance> list = financeMapper.getAllList(null);
        for (Finance fince: list) {
            if (fince.getProject().contains("资金")){
                FinanceSelect myCopy = FinanceTest.copy(fince);
//                financeSelectMapper.insert(myCopy);

            }
        }
        System.out.println("1111");
    }
    public static FinanceSelect copy(Finance finance){
        FinanceSelect financeSelect = new FinanceSelect();
        financeSelect.setId(finance.getId());
        financeSelect.setCode(finance.getCode());
        financeSelect.setPeriod(finance.getPeriod());
        financeSelect.setProject(finance.getProject());
        financeSelect.setCurrentCount(finance.getCurrentCount());

        financeSelect.setLastCount(finance.getLastCount());
        financeSelect.setMyDescribe(finance.getDescribe());
        return financeSelect;

    }
}
