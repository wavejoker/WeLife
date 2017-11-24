package com.welife.mapper;

import com.welife.pojo.WeProduct;
import com.welife.pojo.WeProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeProductMapper {
    int countByExample(WeProductExample example);

    int deleteByExample(WeProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeProduct record);

    int insertSelective(WeProduct record);

    List<WeProduct> selectByExample(WeProductExample example);

    WeProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeProduct record, @Param("example") WeProductExample example);

    int updateByExample(@Param("record") WeProduct record, @Param("example") WeProductExample example);

    int updateByPrimaryKeySelective(WeProduct record);

    int updateByPrimaryKey(WeProduct record);
}