package com.sunfj.dao;

import com.sunfj.entity.AdminSmInstu;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AdminSmInstuMapper {
    @Select("select  instu_id,sys_id,instu_cde,instu_name from admin_sm_instu where instu_id=#{instu_id}")
    AdminSmInstu getByInstuId(@Param("instu_id")String id);
}
