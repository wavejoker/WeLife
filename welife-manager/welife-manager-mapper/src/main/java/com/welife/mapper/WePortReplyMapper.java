package com.welife.mapper;

import com.welife.pojo.WePortReply;
import com.welife.pojo.WePortReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WePortReplyMapper {
    int countByExample(WePortReplyExample example);

    int deleteByExample(WePortReplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WePortReply record);

    int insertSelective(WePortReply record);

    List<WePortReply> selectByExampleWithBLOBs(WePortReplyExample example);

    List<WePortReply> selectByExample(WePortReplyExample example);

    WePortReply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WePortReply record, @Param("example") WePortReplyExample example);

    int updateByExampleWithBLOBs(@Param("record") WePortReply record, @Param("example") WePortReplyExample example);

    int updateByExample(@Param("record") WePortReply record, @Param("example") WePortReplyExample example);

    int updateByPrimaryKeySelective(WePortReply record);

    int updateByPrimaryKeyWithBLOBs(WePortReply record);

    int updateByPrimaryKey(WePortReply record);
}