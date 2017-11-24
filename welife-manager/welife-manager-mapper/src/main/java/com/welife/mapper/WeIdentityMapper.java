package com.welife.mapper;

import com.welife.pojo.WeIdentity;
import com.welife.pojo.WeIdentityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeIdentityMapper {
    int countByExample(WeIdentityExample example);

    int deleteByExample(WeIdentityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeIdentity record);

    int insertSelective(WeIdentity record);

    List<WeIdentity> selectByExample(WeIdentityExample example);

    WeIdentity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeIdentity record, @Param("example") WeIdentityExample example);

    int updateByExample(@Param("record") WeIdentity record, @Param("example") WeIdentityExample example);

    int updateByPrimaryKeySelective(WeIdentity record);

    int updateByPrimaryKey(WeIdentity record);
}