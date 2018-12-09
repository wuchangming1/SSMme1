package main.dao;

import java.util.List;
import main.entity.Finance;
import main.entity.FinanceExample;
import org.apache.ibatis.annotations.Param;

public interface FinanceMapper {
    long countByExample(FinanceExample example);

    int deleteByExample(FinanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Finance record);

    int insertSelective(Finance record);
    List<Finance> getAllList(FinanceExample example);

    List<Finance> selectByExample(FinanceExample example);

    Finance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByExample(@Param("record") Finance record, @Param("example") FinanceExample example);

    int updateByPrimaryKeySelective(Finance record);

    int updateByPrimaryKey(Finance record);
}