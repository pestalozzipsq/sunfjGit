package com.sunfj.dao;

import com.sunfj.entity.AdminReco;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface AdminRecoMapper {
    AdminReco getAdminReco(String id);
}
