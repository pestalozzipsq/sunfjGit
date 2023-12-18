package com.sunfj.controller;

import com.sunfj.dao.AdminSmInstuMapper;
import com.sunfj.entity.AdminReco;
import com.sunfj.dao.AdminRecoMapper;
import com.sunfj.entity.AdminSmInstu;
import com.sunfj.entity.JsonResult;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ar")
@Getter
@Setter
public class AdminRecoController {
    @Autowired
    private AdminRecoMapper adminRecoMapper;

    @Autowired
    private AdminSmInstuMapper adminSmInstuMapper;
    @RequestMapping("/get/{id}")
    public JsonResult<AdminReco> getAr(@PathVariable String id){
        AdminReco adminReco = adminRecoMapper.getAdminReco(id);
        return  new JsonResult<>("00","1",adminReco);
    }

    @RequestMapping("/get1")
    public JsonResult<AdminSmInstu> getAdminSmInstuById(@RequestParam String id){
        AdminSmInstu byInstuId = adminSmInstuMapper.getByInstuId(id);
        return  new JsonResult<>("00","1",byInstuId);
    }

}
