package com.welife.mapper;

import com.welife.pojo.WePostCategory;
import com.welife.pojo.WePostCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WePostCategoryMapper {
    int countByExample(WePostCategoryExample example);

    int deleteByExample(WePostCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WePostCategory record);

    int insertSelective(WePostCategory record);

    List<WePostCategory> selectByExample(WePostCategoryExample example);

    WePostCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WePostCategory record, @Param("example") WePostCategoryExample example);

    int updateByExample(@Param("record") WePostCategory record, @Param("example") WePostCategoryExample example);

    int updateByPrimaryKeySelective(WePostCategory record);

    int updateByPrimaryKey(WePostCategory record);

}