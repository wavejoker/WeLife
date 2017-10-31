package com.welife.mapper;

import com.welife.pojo.WeSign;
import com.welife.pojo.WeSignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeSignMapper {
    int countByExample(WeSignExample example);

    int deleteByExample(WeSignExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeSign record);

    int insertSelective(WeSign record);

    List<WeSign> selectByExample(WeSignExample example);

    WeSign selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeSign record, @Param("example") WeSignExample example);

    int updateByExample(@Param("record") WeSign record, @Param("example") WeSignExample example);

    int updateByPrimaryKeySelective(WeSign record);

    int updateByPrimaryKey(WeSign record);
}