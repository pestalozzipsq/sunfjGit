package com.sunfj.dao;


import com.sunfj.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Insert("insert into User values(#{id},#{username},#{password})")
    Integer insertUser(User user);

    @Select("select * from User where id=#{id}")
    User getUser(Long id);


}
