package com.welife.mapper;

import com.welife.pojo.WeOrganization;
import com.welife.pojo.WeOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeOrganizationMapper {
    int countByExample(WeOrganizationExample example);

    int deleteByExample(WeOrganizationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeOrganization record);

    int insertSelective(WeOrganization record);

    List<WeOrganization> selectByExampleWithBLOBs(WeOrganizationExample example);

    List<WeOrganization> selectByExample(WeOrganizationExample example);

    WeOrganization selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeOrganization record, @Param("example") WeOrganizationExample example);

    int updateByExampleWithBLOBs(@Param("record") WeOrganization record, @Param("example") WeOrganizationExample example);

    int updateByExample(@Param("record") WeOrganization record, @Param("example") WeOrganizationExample example);

    int updateByPrimaryKeySelective(WeOrganization record);

    int updateByPrimaryKeyWithBLOBs(WeOrganization record);

    int updateByPrimaryKey(WeOrganization record);
}