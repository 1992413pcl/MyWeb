package com.bwie.dao;

import com.bwie.pojo.Myemail;
import com.bwie.pojo.MyemailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyemailMapper {
    long countByExample(MyemailExample example);

    int deleteByExample(MyemailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Myemail record);

    int insertSelective(Myemail record);

    List<Myemail> selectByExample(MyemailExample example);

    Myemail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Myemail record, @Param("example") MyemailExample example);

    int updateByExample(@Param("record") Myemail record, @Param("example") MyemailExample example);

    int updateByPrimaryKeySelective(Myemail record);

    int updateByPrimaryKey(Myemail record);
}