package main.service;

import main.dao.FinanceMapper;
import main.entity.Finance;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FinanceService {
    @Autowired
    FinanceMapper financeMapper;

    public List<Finance> getAll(){

        return  financeMapper.selectByExample(null);
    }
}
