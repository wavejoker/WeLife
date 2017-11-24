package com.welife.mapper;

import com.welife.pojo.WeProductCategory;
import com.welife.pojo.WeProductCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeProductCategoryMapper {
    int countByExample(WeProductCategoryExample example);

    int deleteByExample(WeProductCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WeProductCategory record);

    int insertSelective(WeProductCategory record);

    List<WeProductCategory> selectByExample(WeProductCategoryExample example);

    WeProductCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WeProductCategory record, @Param("example") WeProductCategoryExample example);

    int updateByExample(@Param("record") WeProductCategory record, @Param("example") WeProductCategoryExample example);

    int updateByPrimaryKeySelective(WeProductCategory record);

    int updateByPrimaryKey(WeProductCategory record);

    String selectNameByPrimaryKey(Long id);
}