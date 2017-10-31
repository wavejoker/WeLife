package com.welife.mapper;

import com.welife.pojo.WeRoles;
import com.welife.pojo.WeRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeRolesMapper {
    int countByExample(WeRolesExample example);

    int deleteByExample(WeRolesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeRoles record);

    int insertSelective(WeRoles record);

    List<WeRoles> selectByExample(WeRolesExample example);

    WeRoles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeRoles record, @Param("example") WeRolesExample example);

    int updateByExample(@Param("record") WeRoles record, @Param("example") WeRolesExample example);

    int updateByPrimaryKeySelective(WeRoles record);

    int updateByPrimaryKey(WeRoles record);
}