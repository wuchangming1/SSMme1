package main.dao;

import java.util.List;
import main.entity.FinanceSelect;
import main.entity.FinanceSelectExample;
import org.apache.ibatis.annotations.Param;

public interface FinanceSelectMapper {
    long countByExample(FinanceSelectExample example);

    int deleteByExample(FinanceSelectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FinanceSelect record);

    int insertSelective(FinanceSelect record);

    List<FinanceSelect> selectByExample(FinanceSelectExample example);

    FinanceSelect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FinanceSelect record, @Param("example") FinanceSelectExample example);

    int updateByExample(@Param("record") FinanceSelect record, @Param("example") FinanceSelectExample example);

    int updateByPrimaryKeySelective(FinanceSelect record);

    int updateByPrimaryKey(FinanceSelect record);
}