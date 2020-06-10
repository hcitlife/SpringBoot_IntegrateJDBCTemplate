package com.hc.controller;

import com.hc.bean.Dept;
import com.hc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HC on 2018/4/19.
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;


    //http://localhost/jdbcTemplate/add1?dname=0000&loc=000000
    @PostMapping("/add1")
    public String add1(String dname, String loc) {
        Dept dept = new Dept(dname, loc);
        deptService.save1(dept);
        return "success";
    }

    //http://localhost/jdbcTemplate/add2?dname=0000&loc=000000
    @PostMapping("/add2")
    public String add2(String dname, String loc) {
        Dept dept = new Dept(dname, loc);
        deptService.save2(dept);
        return "success";
    }
}
