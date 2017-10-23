package com.manager.tour.dao;

import com.manager.tour.pojo.po.View;
import com.manager.tour.pojo.po.ViewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewMapper {
    int countByExample(ViewExample example);

    int deleteByExample(ViewExample example);

    int deleteByPrimaryKey(Integer viewid);

    int insert(View record);

    int insertSelective(View record);

    List<View> selectByExample(ViewExample example);

    View selectByPrimaryKey(Integer viewid);

    int updateByExampleSelective(@Param("record") View record, @Param("example") ViewExample example);

    int updateByExample(@Param("record") View record, @Param("example") ViewExample example);

    int updateByPrimaryKeySelective(View record);

    int updateByPrimaryKey(View record);
}