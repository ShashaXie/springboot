package com.shasha.springdemo.dao;

import com.shasha.springdemo.model.TUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    String getUserInfo();
}