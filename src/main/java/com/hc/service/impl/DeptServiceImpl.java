package com.hc.service.impl;

import com.hc.bean.Dept;
import com.hc.dao.DeptDao;
import com.hc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HC on 2018/4/19.
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public void save1(Dept dept){
        String sql ="INSERT INTO tb_dept (dname,loc) VALUES (?,?)";
        deptDao.insert(dept);
    }

    @Override
    @Transactional
    public void save2(Dept dept){
        String sql ="INSERT INTO tb_dept (dname,loc) VALUES (?,?)";
        deptDao.insert(dept);
        System.out.println(3/0);
    }
}
