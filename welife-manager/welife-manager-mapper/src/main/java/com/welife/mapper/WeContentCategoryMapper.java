package com.welife.mapper;

import com.welife.pojo.WeContentCategory;
import com.welife.pojo.WeContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeContentCategoryMapper {
    int countByExample(WeContentCategoryExample example);

    int deleteByExample(WeContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeContentCategory record);

    int insertSelective(WeContentCategory record);

    List<WeContentCategory> selectByExample(WeContentCategoryExample example);

    WeContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeContentCategory record, @Param("example") WeContentCategoryExample example);

    int updateByExample(@Param("record") WeContentCategory record, @Param("example") WeContentCategoryExample example);

    int updateByPrimaryKeySelective(WeContentCategory record);

    int updateByPrimaryKey(WeContentCategory record);

    int updateNameById(WeContentCategory category);

    int updateIsParentById(Long id);

}